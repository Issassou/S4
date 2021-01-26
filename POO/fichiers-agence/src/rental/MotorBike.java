package rental;
/**
 * A Motorbike is a vehicule, but in addition it is defined by its cubic
 * capacity
 */
public class MotorBike extends Vehicle {
  private int cubicCapacity ;
  /**
 * creates a Motorbike with given informations
 *
 * @param brand            the Motorbike's brand
 * @param model            the Motorbike's model
 * @param productionYear   the Motorbike's production year
 * @param dailyRentalPRice the daily rental price
 * @param cubicCap         the Motorbike's cubic capacity
 */
 public MotorBike(String brand, String model, int productionYear, float dailyRentalPRice, int cubicCap){
   super(brand,model,productionYear,dailyRentalPRice);
   this.cubicCapacity = cubicCap ;
 }
 /**
  * @return the Motorbike's cubic capacity
  */
 public int getCubicCapacity(){
   return this.cubicCapacity ;
 }
 /**
  * @return a string representation of the Motorbike
  */
 public String toString(){
   return super.toString()+ "\nLa cylindrée est :" + this.cubicCapacity ;
 }

}
