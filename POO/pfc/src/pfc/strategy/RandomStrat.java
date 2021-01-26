package pfc.strategy;

import pfc.*;
import java.util.Random;

/**
 * RandomShap class
 */

public class RandomStrat implements Strategy {

	private static Random alea = new Random();

	/**
	 * @return return a random shape
	 */
	public Shape chooseShape() {
		return Shape.values()[alea.nextInt(Shape.values().length)];
	}
}
