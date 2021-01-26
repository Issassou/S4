package rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import rental.*;

public class SuspiciousRentalAgencyTest {

	@Test
	public void testRentVehicleForClientUnder25() throws UnknownVehicleException, IllegalStateException {
		SuspiciousRentalAgency a = new SuspiciousRentalAgency();
		Client c1 = new Client("Tim Oleon", 20);
		Vehicle v1 = new Vehicle("Vroum", "Vroum", 2000, 100);
		a.addVehicle(v1);
		assertEquals(110, a.rentVehicle(c1, v1), 0.0001);
	}

	@Test
	public void testRentVehicleForClientMoreThan25YearsOld() throws UnknownVehicleException, IllegalStateException {
		SuspiciousRentalAgency a = new SuspiciousRentalAgency();
		Client c2 = new Client("Jean Dupont", 50);
		;
		Vehicle v2 = new Vehicle("Peugeot", "308", 2008, 100);
		a.addVehicle(v2);
		assertEquals(100, a.rentVehicle(c2, v2), 0.0001);
	}

	// ---Pour permettre l'execution des tests ----------------------
	public static junit.framework.Test suite() {
		return new junit.framework.JUnit4TestAdapter(rental.SuspiciousRentalAgencyTest.class);
	}
}
