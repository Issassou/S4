package pfc;
public enum Shape{
  ROCK,PAPER,SCISSORS;



  public int CompareShape(Shape s){
    if(this==s){
      return 0;
    }else if(this==Shape.ROCK){
      if(s==Shape.SCISSORS){
        return 1;
      }else {
        return -1;
      }
    }else if(this==Shape.PAPER){
      if(s==Shape.ROCK){
        return 1;
      }else{
        return -1;
      }
    }else{
      if(s==Shape.PAPER){
        return 1;

      }else{
        return -1;
      }
    }

  }
  public Shape getNext(){
    return Shape.values()[(this.ordinal()+1)%Shape.values().length];
  }
}
