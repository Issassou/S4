
/**
 * Décrivez votre classe LightString ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class LightString
{
    
    private int lightsNumber ;
    LightBulb [] tab ;
    private String state ;
    private String colour ;
    private int power ;
    /**
     * Builds the LightString class .  
     * @param the number of the lightbulb on the lightString .
     */
    public LightString(int n)
    {
        this.state = "off" ;
        this.lightsNumber = n ;
        this.colour = "white" ;
        this.power = 1 ;
        this.tab = new LightBulb[this.lightsNumber];
        for(int i=0 ; i<n ; i++){
            tab[i] = new LightBulb();
    }

   }
   /**
   *allows the obtain the power of one lightbulb 
   *@return the power of one lightbulb in the Stringlight 
   */
   public int getLightPower(){
        return this.power;
    }
   
   /**
   *allows to obtain the number of the lightbulbs in the Stringlight  
   *@return the number of the lightbulbs in the Stringlight  
   */
   public int getNumber(){
       return this.lightsNumber ;
    }
   /** return the n-th Lightbulb of the LightString 
   * @param i the index of the Lightbulb to return
   */
   public String i_lightbulb(int n){

        if(n>this.lightsNumber){
               return null;
        }else{
               return this.tab[n].toString();
        }
    }
   /** replace the n-th lightbulb of the light string by the given lightbulb.
     *  Nothing happens if i is not a valid index.
     * @param i the number of the lightbulb to be changed (first has number 1)
     * @param theBulb the new lightbulb
       */
   public void changeLightbulb(int i, LightBulb theBulb){
      
     if(i<=this.lightsNumber){
           this.tab[i]=theBulb;
        }
    }
   /**
   * allows to change the state of the  lightbulbs on the Stringlight
   */
   public void change_state(){
        
        if(this.state =="off"){
            this.state ="on";
            for(int i=0;i<this.lightsNumber;i++){
                this.tab[i].status="on";
            }
        }
        else{
            this.state="off";
            for(int i=0;i<this.lightsNumber;i++){
                this.tab[i].status ="off";
            }
        }
    }
    
    

}

