package rental;

import java.util.*;

public class Main2{
   public static void main(String[] args) {

 		RentalAgency agency = new RentalAgency();
 		// instanciation de vehicules
 		Vehicle v1 = new Car("Chevrolet", "Camaro", 2017, 260, 5);
 		Vehicle v2 = new Car("Peugeot", "307", 2006, 110, 5);
 		Vehicle v3 = new MotorBike("Yamaha", "Niken", 2011, 200, 874);
 		Vehicle v4 = new MotorBike("Honda", "RC213V", 2014, 230, 1000);

 		// ajout de vehicules à l'agence
 		agency.addVehicle(v1);
 		agency.addVehicle(v2);
 		agency.addVehicle(v3);
 		agency.addVehicle(v4);

 		// selection par le filtre MaxPriceFilter
 		VehicleFilter maxPrice = new MaxPriceFilter(200);
 		System.out.println("Les vehicules dont le prix de location ne dépasse pas 200: ");
 		agency.displaySelection(maxPrice);


    SuspiciousRentalAgency srAgency = new SuspiciousRentalAgency();
		Vehicle v5 = new Vehicle("Vroum", "Vroum", 2000, 100);
		Vehicle v6 = new Vehicle("Peugeot", "308", 2008, 150);
		srAgency.addVehicle(v5);
		srAgency.addVehicle(v6);

		// instanciation de clients
		Client client1 = new Client("Tim Oleon", 32);
		Client client2 = new Client("Tim Lee", 22);

		try {
			srAgency.rentVehicle(client1, v5);
		} catch (Exception e) {
			System.out.println("Vehicle already rented or client has already rent a vehicle");
		}

		if (srAgency.hasRentedAVehicle(client1)) {
			System.out.println(client1.getName() + " a " + client1.getAge()
					+ "ans et a loué une voiture pour un prix journalier de: "
					+ srAgency.getDailyRentalPrice(client1));
			srAgency.returnVehicle(client1);
		}
		if (!(srAgency.hasRentedAVehicle(client2) && srAgency.isRented(v6))) {
			try {
				srAgency.rentVehicle(client2, v5);
				System.out.println(client2.getName() + " a " + client2.getAge()
						+ "ans et a loué la voiture rendue par le client precedent pour un prix journalier de: "
						+ srAgency.getDailyRentalPrice(client2));
			} catch (Exception e) {
				System.out.println("Vehicle already rented or client has already rent a vehicle");
			}
		}

  }
}
