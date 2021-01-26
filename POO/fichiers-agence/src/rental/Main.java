package rental;

import java.util.*;

/**
 * Main to manipulates the class RentalAgency
 */

public class Main {
	public static void main(String[] args) {

		RentalAgency agency = new RentalAgency();
		// instanciation de vehicules
		Vehicle v1 = new Vehicle("Vroum", "Vroum", 2000, 100);
		Vehicle v2 = new Vehicle("Peugeot", "308", 2008, 150);
		Vehicle v3 = new Vehicle("Chevrolet", "Camaro", 2017, 260);

		// ajout de vehicules à l'agence
		agency.addVehicle(v1);
		agency.addVehicle(v2);
		agency.addVehicle(v3);

		// selection par le filtre MaxPriceFilter
		VehicleFilter maxPrice = new MaxPriceFilter(160);
		System.out.println("Les vehicules dont le prix de location ne dépasse pas 160: ");
		agency.displaySelection(maxPrice);

		// selection par le filtre BrandFilter
		VehicleFilter brandf = new BrandFilter("Peugeot");
		System.out.println("Les vehicules dont la marque est Peugeot : ");
		agency.displaySelection(brandf);

		// selection par le filtre BrandFilter et par le filtre MaxPriceFilter
		AndFilter priceBrand = new AndFilter();
		priceBrand.addFilter(maxPrice);
		priceBrand.addFilter(brandf);
		System.out.println("Les vehicules dont la marque est Peugeot et dont le prix de location ne dépasse pas 160: ");
		agency.displaySelection(priceBrand);

		// instanciation de clients
		Client client1 = new Client("Tim Oleon", 25);
		Client client2 = new Client("Tim Lee", 32);

		try {
			agency.rentVehicle(client1, v1);
		} catch (Exception e) {
			System.out.println("Vehicle already rented or client has already rent a vehicle");
		}
		if (agency.hasRentedAVehicle(client1)) {
			System.out.println(client1.getName() + " à loué une voiture et maintenant il va la rendre.");
			agency.returnVehicle(client1);
		}

		if (!agency.hasRentedAVehicle(client2) && !agency.isRented(v1)) {
			try {
				agency.rentVehicle(client2, v1);
				System.out.println(client2.getName() + " à loué la voiture rendue par le client precedent.");
			} catch (Exception e) {
				System.out.println("Vehicle already rented or client has already rent a vehicle");
			}
		}
	}
}
