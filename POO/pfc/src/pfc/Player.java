package pfc;
import pfc.strategy.* ;
/**
 * @author AIT ALI BELKACEM , BEKKOUCHE .
 * @version March 22 th,2020
 */

public class Player {

	private String name;
	private int points;
	private Strategy myStrategy;
	public static Player personne = new Player(null, null);

	/**
	 * Creates a player defined by its name, number of points and Strategy
	 *
	 * @param name     the name of the player
	 * @param strategy the the game strategy of the player
	 */
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.points = 0;
		this.myStrategy = strategy;
	}

	/**
	 * add poitn to the player
	 *
	 * @param p the number of points to add to the player
	 */
	public void addPoints(int p) {
		this.points += p;
	}

	/**
	 * return the Score of the player (number of points)
	 */
	public int getScore() {
		return this.points;
	}

	/**
	 * return the name of the player
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * return the Shape that the player choose
	 */
	public Shape play() {
		return this.myStrategy.chooseShape();
	}

	/**
	 * set the new strategy of the player
	 */
	public void setStrategy(Strategy s) {
		this.myStrategy = s;
	}

}
