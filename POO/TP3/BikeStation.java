


public class BikeStation {

    private int capacity;
		private String name ;
		private Bike Bikes[];
		private int available;
    /**
     * Builds a BikeStation class
		 * @param name the name of station
	 	 * @param capacity  the number of bikes that a station can hold
     */
	public BikeStation(String name, int capacity) {
	    this.capacity = capacity;
			this.name = name ;
			this.available = 0 ;
			Bikes=new Bike[this.capacity] ;
	}

    /**
		 * returns the name of the bakeStation .
     * @return the name of the bakeStation .
     */
	public String getName() {
		return this.name ;
	}

    /**
		 * returns the name of the bakeStation .
     * @return the capacity of the bikeStation.
     */
	public int getCapacity() {
		return this.capacity ;
	}

    /**
		 * returns the number of available bikes in the bikeStation
     * @return the number of available bikes in the bikeStation
     */
	public int getNumberOfBikes() {
		 return this.available ;
	}

    /**
     *
		 *
     */
	public int firstFreeSlot() {
			int i=0;
			while(i<this.Bikes.length && this.Bikes[i] instanceof Bike){
				i++;
		}

		if(i<this.Bikes.length){
			return i;
		}

		else
				return -1;
	}


/** drop a bike to the bikestation
	* @param bike the bike to drop to the bikestation
	 * @return true if it was possible to drop the bike , false otherwise.
	 */
	public boolean dropBike(Bike bike) {
		  int ffs = this.firstFreeSlot();
		  if (ffs != -1){
				 this.Bikes[ffs]=bike;
				 this.available++;
				 return true;
			}
	    return false;
	}



/** get the bike at the ith position from the bikestation
  *  @param i the position of the bike which be taken
 	* @return  the bike at the ith position if it exists , null otherwise.
  */
	public Bike takeBike(int i) {
		if(i>=0 &&  i<this.capacity && this.Bikes[i] instanceof Bike){
				Bike res = this.Bikes[i];
				this.Bikes[i] = null;
				this.available--;
				return res;
		}
		return null;
	}


}
