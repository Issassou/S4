package rental ;
/**
 * A Car is a vehicule, but in addition it is defined by its number of
 * passengers
 */
public class Car extends Vehicle {
  private int nbPassengers ;
  /**
 * creates a car with given informations
 *
 * @param brand            the car's brand
 * @param model            the car's model
 * @param productionYear   the car's production year
 * @param dailyRentalPRice the daily rental price
 * @param nbPass           the number of passagers
 */
 public Car(String brand, String model, int productionYear, float dailyRentalPRice, int nbPass){
   super(brand,model,productionYear,dailyRentalPRice);
   this.nbPassengers = nbPass ;
 }

/**
* @return the number of passengers
*/
 public int getNbPassengers(){
   return this.nbPassengers ;
 }
 /**
 * @return a string representation of the car
 */
 public String toString(){
  return super.toString() + "\nNombre de passagers:" + this.nbPassengers;
}


}
