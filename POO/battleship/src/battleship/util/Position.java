package battleship.util ;

public class Position {
    private int x;
    private int y;

 /**define position of a cell*/
    public Position(int x1,int y1){
      this.x = x1 ;
      this.y = y1 ;
    }

 /**Give Xposition of a cell
 *@return xposition
 */
    public int getX(){
      return this.x;
    }

  /**Give Yposition of a cell
  *@return yposition
  */
    public int getY(){
      return this.y;
    }


	/** two position are equals if they have the x and the same y
	 * @param o the object to test equality with
	 * @return <code>true</code> iff o is a position with the same position than the object
	 */
    public boolean equals(Object o){
      if (o instanceof Position) {
        Position other = (Position) o ;
        if (this.x == other.x && this.y == other.y){
          return true ;
        }else{
          return false ;
        }
      }else {
          return false ;
      }
    }
    /**
 * @return a string description of the position
 */
  public String toString() {
    return "position x: "+this.x+", position y: "+ this.y;
  }
}
