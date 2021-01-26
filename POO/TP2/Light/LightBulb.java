
/**
 * Write a description of class LightBulb here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LightBulb
{
    public String status ;
    public int power;
    public String colour;
    /**
     * Builds a LightBulb
     */
    public LightBulb()
    {
        this.status = "off" ;
        this.colour="white";
        this.power=1;

    }
    /**
     * allows to obtain the state of the lightbulb
     * @return the state of the lightbulb 'on' or 'off' 
     */
    public String getStatus(){
        return this.status;
    }
    /**
     * allows to obtain the color of the lightbulb
     * @return the colour of the lightbulb  
     */
    public String getColour(){
        return this.colour;
    }
    /**
     * allows to obtain the power of the lightbulb
     * @return the power of the lightbulb on WATT 
     */
    public int getPower(){
        return this.power;
    }
    /**
     * allows to change the state  of the lightbulb 'on' to 'off' or 'off' to 'on' 
     */
    public void setStatus(){
         if(this.status == "on"){
            this.status = "off" ;
        }else{
         this.status = "on" ;
        }
    }
     /**
    * @return a description of the lightbulb 
    */
    public String toString(){
      
      return "this light has "+this.power+" Watt, it's color is "+this.colour+" and it's "+this.status;
   
    }
}

