package battleship ;
import battleship.util.*;
import io.Input;
/**
 * A class to launch the game ,
 */
public class Main{
  public static void main(String[] args) {
    Sea sea = new Sea(5,5);
    Ship s1=new Ship(2);
    Ship s2=new Ship(2);
    Ship s3=new Ship(3);
    Ship s4=new Ship(2);
    //ADD FIRST SHIP
    Position p1 =new Position(1,0);
    sea.addShipHorizontally(s1,p1);
    //ADD SECOND ONE
    Position p2 =new Position(1,3);
    sea.addShipVertically(s2,p2);
    //ADD THIRD ONE
    Position p3 =new Position(3,0);
    sea.addShipHorizontally(s3,p3);
    //ADD FOURTH ONE
    Position p4 =new Position(4,3);
    sea.addShipHorizontally(s4,p4);
    System.out.println("This game is named \"Battleship\" you have to guess the location of the 4 ships on the sea and shoot them, once you have destroyed all of them you win.");
    System.out.println("The cooredinates of the cells starts from ZERO, see the x and y axes below : ");
    System.out.println("0 --------------------------------> Y ");
    for(int i=0;i<8;i++){System.out.println("|");}
    System.out.println("v");
    System.out.println("X");
    //Create the Game
    Game game= new Game(sea);
    //Launch the game
    game.play();
	}
}
