package battleship.util;

public enum Level{
  EASY(25), MEDIUM(16), HARD(10);

  private int nbAttempts;

  private Level(int nbAttempts){
    this.nbAttempts = nbAttempts;
  }

  public int getNbAttempts(){
    return this.nbAttempts;
  }
}
