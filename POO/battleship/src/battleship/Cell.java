package battleship;


public class Cell{
  private Ship ship ;
  private boolean shot ;
  private boolean seen;
/**
* Creates a cell
*/
  public Cell(){
    this.ship = null ;
    this.shot = false ;
    this.seen=false;
  }
/**
* Sets a ship
*/
  public void setShip(Ship s){
    this.ship = s ;
  }
/**
* returns this cell's ship
* @return this cell's ship
*/
  public Ship getShip(){
    return this.ship  ;
  }
/** Returns <code>true</code> if this cell is empty, <code>false</code> otherwise.
* @return <code>true</code> if this cell is empty, <code>false</code> otherwise.
*/
  public boolean isEmpty(){
    return this.ship==null;
  }
  /** Returns <code>true</code> if this cell has been shot, <code>false</code> otherwise.
  * @return <code>true</code> if this cell has been shot, <code>false</code> otherwise.
  */
  public boolean hasBeenShot(){
    return this.shot!=false;
  }
 /** Shoots on this cell
 *  @return SUNK if this cell's ship is sunk , MISSED if this cell is missed , HIT Otherwise.
 */
  public Answer shot(){

    if(this.hasBeenShot()|| this.isEmpty() ){
      return Answer.MISSED;
    }else {
      this.shot = true;
      this.ship.hitted();
      if(this.ship.hasBeenSunk())
        return Answer.SUNK;
      return Answer.HIT;
    }
  }
  /**
  * returns the strig representation of this for both defender and oppenent
  * @param defender <code>true</code> if it is for a defender , <code>false</code> otherwise.
  * @return the strig representation of this
  */
  public String getCharacter(boolean defender){
      String res;
      if (defender){
        if(this.hasBeenShot())
          res="*";
        else if(this.isEmpty())
          res="~";
        else
          res="B";
      }
      else{
        if(this.isEmpty())
          res="~";
        else if(!this.hasBeenShot())
          res=".";
        else
          res="*";
        }
      return res;
  }



}
