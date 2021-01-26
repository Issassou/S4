package battleship;
/**
 * A class to represent a ship,
 * the ship has at the begining a certain number of life points that
 * decreases each time it is hitted,
 * when there is no more life points the ship has been sunk.
 */
public class Ship {
  private int lifePoints;
/**Creates a ship with given lifePoints
* @param l this ship's lifePoints
*/
  public Ship(int l){
    this.lifePoints=l;
  }
  /**
* Return this ship's lifePoints
* @return this ship's lifePoints
*/
  public int getLifePoints(){
    return this.lifePoints;
  }
  /**
 * Return <code>true</code> if this has been sunk, <code>false</code> otherwise.
 * @return <code>true</code> if this has been sunk, <code>false</code> otherwise.
 */
  public boolean hasBeenSunk(){
    return this.lifePoints==0;

  }

  /**
   *Dicreases ship's lifePoints
   */
  public void hitted(){
     this.lifePoints--;
  }

}
