package battleship ;
import battleship.util.*;
import io.Input;
/**
 * A class to represent the game ,
 */
public class Game{
  private Sea s;

  /**
  * Creates the game
  */
  public Game(Sea s){
    this.s=s;
  }

  /** starts the game
  */
  public void play(){

    int attempts=0;
        Level l=null;
        try{
            // THE USER CHOOSES A LEVEL, EACH LEVEL DEFINES HOW MUCH ATTEMPTS ARE ALLOWED
            System.out.print(" Choose a level by entering the corresponding letter: (E:Easy)(M:Medium)(H:Hard) ");
            String userString = Input.readString();
            userString = userString.substring(0,1).toLowerCase();
            //System.out.println(String.format ("Debug : userString=%s",userString));
            if(userString.equals("m")){
              l=Level.MEDIUM;
              attempts=l.getNbAttempts();
            }
            else if (userString.equals("h")){
              l=Level.HARD;
              attempts=l.getNbAttempts();
            }
            else{
              l=Level.EASY;
              attempts=l.getNbAttempts();
            }
          }catch(Exception e ){
            l=Level.EASY;
            attempts=l.getNbAttempts();
          }
          finally{
            System.out.println("Level: "+l);
            System.out.println("Attempts: "+attempts);
          }
          //System.out.println(String.format ("Debug : attempt=%s",attempts));

        //LOOP FOR THE GAME
        while(s.getRemainingLifePoints()!=0 && attempts!=0){
          int userIntX;
          int userIntY;
          Position p = null;
          Answer answer;
          try{

            s.display(false);
            System.out.print("Enter the X and Y coordinate of the cell you want to shoot : ? ");
            userIntX = Input.readInt();
            //System.out.print("Enter the Y coordinate of the cell you want to shoot : ? ");
            userIntY = Input.readInt();
            p = new Position(userIntX,userIntY);
            answer = s.shoot(p);
          } catch (Exception e) {
            System.out.println(e);
    		      //"exception... : input does not correspond to an integer or integer is too large
    		     // here we choose to provide a default value
    		     userIntX = 0;
             userIntY = 0;
             //System.out.println(String.format ("Debug : p.userIntX=%s,  p.userIntY=%s",p.getX(),p.getY()));
             System.out.println("You entred a wrong value, by default you shoot the cell (0,0)");
             p = new Position(userIntX,userIntY);
             answer = s.shoot(p);

    	    }
          finally{
            attempts--;
            System.out.println("remaining attempt: "+attempts);
          }
        }
        System.out.println("\n END \n");
        s.display(false);
        if(s.getRemainingLifePoints()!= 0){
           System.out.println("\n  YOU LOSE :( \n");
        }
        else{
           System.out.println("\n CONGRATULATION YOU WIN :D \n");
        }
      }


}
