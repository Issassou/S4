package rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import rental.*;

public class RentalAgencyTest {
	private RentalAgency a;
	private Client c1;
	private Vehicle v1;
	private Vehicle v2;

	@Before
	public void before() {
		// réinitialisation des attributs pour chacun des tests
		this.a = new RentalAgency();
		this.c1 = new Client("Tim Oleon", 25);
		this.v1 = new Vehicle("Vroum", "Vroum", 2000, 100);
		this.v2 = new Vehicle("Peugeot", "308", 2008, 110);
	}

	@Test
	public void testAddVehicle() {
		assertFalse(this.a.allVehicles().contains(this.v1));
		this.a.addVehicle(this.v1);
		assertTrue(this.a.allVehicles().contains(this.v1));
	}

	@Test
	public void testSelect() {
		VehicleFilter filter = new MaxPriceFilter(110);
		this.a.addVehicle(this.v1);
		this.a.addVehicle(this.v2);
		assertTrue(this.a.select(filter).contains(this.v1));
		assertFalse(this.a.select(filter).contains(this.v2));
	}

	@Test
	public void testHasRentedAVehicle() throws UnknownVehicleException, IllegalStateException {
		this.a.addVehicle(this.v1);
		this.a.rentVehicle(this.c1, this.v1);
		assertTrue(this.a.hasRentedAVehicle(this.c1));
		Client c2 = new Client("Tim Lee", 32);
		assertFalse(this.a.hasRentedAVehicle(c2));
	}

	@Test
	public void testIsRanted() throws UnknownVehicleException, IllegalStateException {
		this.a.addVehicle(this.v1);
		this.a.rentVehicle(this.c1, this.v1);
		assertTrue(this.a.isRented(this.v1));
		assertFalse(this.a.isRented(this.v2));
	}

	@Test
	public void testRentVehicle() throws UnknownVehicleException, IllegalStateException {
		this.a.addVehicle(this.v1);
		this.a.rentVehicle(this.c1, this.v1);
		assertTrue(this.a.isRented(this.v1));
	}

	@Test(expected = IllegalStateException.class)
	public void testRentVehicleAlreadyRented() throws UnknownVehicleException, IllegalStateException {
		this.a.addVehicle(this.v1);
		this.a.rentVehicle(this.c1, this.v1);
		Client c2 = new Client("Tim Lee", 32);
		this.a.rentVehicle(c2, this.v1);
	}

	@Test(expected = IllegalStateException.class)
	public void testRentVehicleClientRentsAlready() throws UnknownVehicleException, IllegalStateException {
		this.a.addVehicle(this.v1);
		this.a.addVehicle(this.v2);
		this.a.rentVehicle(this.c1, this.v1);
		this.a.rentVehicle(this.c1, this.v2);
	}

	@Test(expected = UnknownVehicleException.class)
	public void testRentNotExistingVehicle() throws UnknownVehicleException, IllegalStateException {
		this.a.rentVehicle(this.c1, this.v1);
	}
	@Test
	public void twoClientObjectsWithSameNameCorrespondsToSameClient() throws IllegalStateException, UnknownVehicleException {
		RentalAgency agency = new RentalAgency();
		Vehicle v = new Vehicle("Vroum", "Vroum", 2000, 100);
		agency.addVehicle(v);
		Client client1 = new Client("Tim Oleon", 25);
		assertEquals(100, agency.rentVehicle(client1, v),0.0001);
		assertTrue(agency.hasRentedAVehicle(client1));
		// client2 corresponds to same client than client1 since names are equals
		Client client2 = new Client("Tim Oleon", 25);
		// then test should succeed
		assertFalse(agency.hasRentedAVehicle(client2));
	}

	// ---Pour permettre l'execution des tests ----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(rental.RentalAgencyTest.class);
	}

}
