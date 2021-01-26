
/**
 * Write a description of class Goods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Goods
{
    
   private double value;
   private String name;
    /**
     * Builds the object Goods where only the name is defined.
     */
    public Goods(String n)
    {
        this.name = n ;
        this.value = 0;
        
    }
    /**
     *Builds the object Goods where both of the name and the value are defined.
     */
    public Goods(String n ,double v){
        this.name = n ;
        this.value = v ;
    }

    /**
     * returns the goods's value .
     *
     * @return   the goods's value .
     */
   public double getValue(){
      return this.value;    
    }
    /**
     *  returns the goods's name.
     *  @return returns the goods's name.
     */
   public String getName(){
      return this.name;
    }
    /**
     * gives the value v to the goods
     * 
     */
   public void setValue(double v){
      this.value=v;
    }
    /**
     * gives the name n to the goods
     */
   public void setName(String n){
     this.name = n;
    }
    /**
     *  provide a string representation for this goods object
      * @return  a string representation for this goods object
     */
   public String toString(){
     return "The goods  "+ this.name +" costs  " + this.value ;
    }
   public double ttcValue(){
        return this.value+(this.value*0.2);
    
    }
}
