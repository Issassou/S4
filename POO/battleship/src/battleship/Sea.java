package battleship;
import battleship.Ship.*;
import battleship.Cell.*;
import battleship.Answer.*;
import battleship.util.*;

/**
 * A class to represent the game board that we named Sea,
 * this game board can contain Ships vertically or horizontally,
 * It has at the begining a certain number of life points that
 * decreases each time one of its ships is hitted.
 *
 */
public class Sea{
  private Cell [][] cells;
  private int remainingLifePoints;

  /**
  * Creates a sea with given number of rows and a given number of columns
  * @param nbRows the number of rows
  * @param nbColumns the number of columns
  */
  public Sea( int nbRows, int nbColumns){
    this.remainingLifePoints=0;
    this.cells= new Cell [nbRows][nbColumns];
    for(int i=0;i<nbRows;i++){
      for(int j=0;j<nbColumns;j++){
        this.cells[i][j]=new Cell();
      }
    }
  }

  /**
  * Returns the cell at position p
  * @param p the position of the cell that we want to get
  * @throws ArrayIndexOutOfBoundsException if the position p is out of the sea
  * @return the cell at position p
  */
  public Cell getCell(Position p )throws ArrayIndexOutOfBoundsException{
    return this.cells[p.getX()][p.getY()];
  }

  /** Shoots a certain cell
  * @param p the position of the cell we want to shoot
  * @throws ArrayIndexOutOfBoundsException if the cell we want to shoot is out of the sea
  * @return HIT if the cell is hitted , MISSED if the cell is missed or SUNK if this cell's ship is sunk
  */
  public Answer shoot(Position p) throws ArrayIndexOutOfBoundsException{
    Answer a;
    Cell cell;
    cell=this.getCell(p);
    a=cell.shot();
    if (a!=Answer.MISSED)
      remainingLifePoints--;
    return a;
  }

  /** displays the board line by line and cell by cell,
  *    the display changes for the defender or the opponent, defined
  *    by the <code>defender</code> argument
  * @param defender <code>true</code> if display is for defender,
  *       <code>false</code> if for opponent
  */
  public void display(boolean defender){
    for(int i=0;i<cells.length;i++){
      for(int j=0;j<cells[0].length;j++){
        Cell c = this.cells[i][j];
        System.out.print(c.getCharacter(defender)+" ");
      }
      System.out.print("\n");
    }
  }

  /** add the ship shipToPlace vertically down from position p.  The number of
  *    cells is determined by the ship length.
  * @param shipToPlace the ship to add
  * @param position the position of the first (top) cell occupied by the ship
  * @throws IllegalStateException if the ship shipToPlace can not be placed on the sea
  *    (outside of the board or some cell is not empty)
  */
  public void addShipVertically(Ship shipToPlace, Position position)
  throws IllegalStateException
  {
    Cell shipCells[];
    int lifepoints = shipToPlace.getLifePoints();
    try{
      shipCells = new Cell[lifepoints];
      for(int i=0;i<lifepoints;i++){
        Position p = new Position(position.getX()+i,position.getY());
        Cell c = this.getCell(p);
        if (c.isEmpty())
         shipCells[i]=c;
        else throw new IllegalStateException();
      }
      for(int i=0;i<lifepoints;i++){
        shipCells[i].setShip(shipToPlace);
      }
      this.remainingLifePoints+=shipToPlace.getLifePoints();
    }
    catch(ArrayIndexOutOfBoundsException e){
      throw new  IllegalStateException();
    }
  }

  /** add the ship shipToPlace right from position p.  The number of
  *    cells is determined by the ship length.
  * @param shipToPlace the ship to add
  * @param position the position of the first (left) cell occupied by the ship
  * @throws IllegalStateException if the ship shipToPlace can not be placed on the sea
  *    (outside of the board or some cell is not empty)
  */
  public void addShipHorizontally(Ship shipToPlace, Position position)
  throws IllegalStateException
  {
    Cell shipCells[];
    int lifepoints = shipToPlace.getLifePoints();
    try{
      shipCells = new Cell[lifepoints];
      for(int i=0;i<lifepoints;i++){
        Position p = new Position(position.getX(),position.getY()+i);
        Cell c = this.getCell(p);
        if (c.isEmpty())
          shipCells[i]=c;
        else throw  new IllegalStateException();
      }
      for(int i=0;i<lifepoints;i++){
        shipCells[i].setShip(shipToPlace);
      }
      this.remainingLifePoints+=shipToPlace.getLifePoints();
    }
    catch (ArrayIndexOutOfBoundsException e){
      throw  new IllegalStateException();
    }
  }

  /** Returns the remaining life points
  * @return the remaining life points
  */
  public int getRemainingLifePoints(){
    return this.remainingLifePoints;
  }
}
