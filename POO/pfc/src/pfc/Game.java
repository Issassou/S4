package pfc;

public class Game {
  private Player p1;
  private Player p2;


/*create a Game
 * @param p1 the player 1
 * @param p2 the player 2
*/
  public Game(Player player1,Player player2){
    this.p1=player1;
    this.p2=player2;

    }
/**
* play one round and give the points to the winner
*/

  public void playOneRound(){
    Shape s1;
    Shape s2;
    s1=this.p1.play();
    s2=this.p2.play();
    int income=s1.CompareShape(s2);
    this.givePoints(income);

  }
/**
* give points to the winner
* @param points the points of the player
*/

  public void givePoints(int points){
	if (points == 0) {
		System.out.print("Coup NULL , 1 point pour chaque\n");
		this.p1.addPoints(1);
		this.p2.addPoints(1);
	} else if (points == 1) {
		System.out.print(p1.getName() + " l'emporte et marque 2 points \n");
		this.p1.addPoints(2);
	} else {
		System.out.print(p2.getName() + " l'emporte et marque 2 points \n");
		this.p2.addPoints(2);
	}
	System.out.print("Le score est maintenant :  " + p1.getName() + " = " + p1.getScore() + "points        "
				+ p2.getName() + " = " + p2.getScore() + "points\n");
}
/**
* this function makes both players play nbRounds and return the winner
*
* @param nbRounds number of round that you want to play
* @return the winner (Player)
*
*/

public Player play(int nbRounds) {
	for (int i = 0; i < nbRounds; i++) {
		System.out.print("ROUND NUMBER: " + i + "\n");
		playOneRound();
	}
	if (this.p1.getScore() > this.p2.getScore()) {
		System.out.print("LE VAINQUEUR EST : " + p1.getName() + "\n");
		return this.p1;
	} else if (this.p1.getScore() < this.p2.getScore()) {
		System.out.print("LE VAINQUEUR EST : " + p2.getName() + "\n");
		return this.p2;
	} else {
		System.out.print("MATCH NULL");
		return Player.personne;
	}
}
}
