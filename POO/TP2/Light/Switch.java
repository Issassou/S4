import java.util.*;
  /**
   * class Switch allows to control the state,color ,power of the lightbulb.
 */
 public class Switch
 {
 LightBulb l = new LightBulb();
 private String state; 

 /**
   * constructor of the switch 
  */
  public Switch(){
    this.state="off";
 }
 
 
 /**
   *optional constructor of the switch 
   *@param the bulb lightbulb be controled by the switch  
  */
 public Switch(LightBulb thebulb){
    this.state="off";
    thebulb.status = this.state ;
 }

  /**
   * allows to obtain the state of the Switch 
   *@return the state of the switch 
  */
  public String getSwitchState(){
      return this.state;
 }
 /**
   * allows to change the state of the switch so the state of the lightbulb   
 */
 public void setUPSwitch(){
     this.state="on";
     l.status = this.state ; 
 }
 public void setDOwnSwitch(){
     this.state="off";
     l.status = this.state ; 
}
 
 
/**
   *allows to obtain the state of the lightbulb 
   *@return the state of the lightbulb  
  */
 public String lightGetEtat(){
     return l.status; 
}

}
   
