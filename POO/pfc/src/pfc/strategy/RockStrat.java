package pfc.strategy;

import pfc.*;

public class RockStrat implements Strategy {

	/**
	 * return allways ROCK
	 *
	 * @return the shape ROCK
	 */
	public Shape chooseShape() {
		return Shape.ROCK;
	}
}
