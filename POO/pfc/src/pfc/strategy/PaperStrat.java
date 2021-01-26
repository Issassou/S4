package pfc.strategy;

import pfc.*;

public class PaperStrat implements Strategy {

	/**
	 * @return a pierre shape
	 */
	public Shape chooseShape() {
		return Shape.PAPER;
	}
}
