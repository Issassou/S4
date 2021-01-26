package rental;
 /**
 * a rental vehicle agency, client can rent one vehicle at a time , 10% supply
 * for client who is under 25 year old
 */
public class SuspiciousRentalAgency extends RentalAgency{
  
  public SuspiciousRentalAgency(){
    super();
  }
  /**
	 * client rents a vehicle
	 *
	 * @param client the renter
	 * @param v      the rented vehicle
	 * @return the daily rental price
	 * @exception UnknownVehicleException if v is not a vehicle of this agency
	 * @exception IllegalStateException   if v is already rented or client rents
	 *                                    already another vehicle
	 */
	public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {
		if (this.theVehicles.contains(v)) {
			if (!(this.hasRentedAVehicle(client) && this.isRented(v))) {
				this.rentedVehicles.put(client, v);
				if (client.getAge() >= 25) {
					return v.getDailyPrice();
				} else {
					return v.getDailyPrice() * 1.1f;
				}
			} else {
				throw new IllegalStateException();
			}
		} else {
			throw new UnknownVehicleException();
		}
	}

	/**
	 * Gives the daily rental price of the vehicle rented by the Client client
	 *
	 * @param client the renter
	 * @return the daily rental price
	 * @exception IllegalStateException if client didn't rent a vehicle
	 */
	public float getDailyRentalPrice(Client client) throws IllegalStateException {
		if (this.rentedVehicles.containsKey(client)) {
			if (client.getAge() >= 25) {
				return this.rentedVehicles.get(client).getDailyPrice();
			} else {
				return this.rentedVehicles.get(client).getDailyPrice() * 1.1f;
			}
		} else {
			throw new IllegalStateException();
		}
	}


}
