package date;
import date.Date;

public enum Month{
  janvier(31),fevrier(28),mars(31),avril(30),mai(31),
  juin(30),juillet(31),aout(31),septembre(30),octobre(31),
  novembre(30),decembre(31);
  private final int Nbjrs;
  /*
  create a Month
  */
  private Month(int Nbjrs){
    this.Nbjrs=Nbjrs;
  }
  /*return the number of days for this Month
  *@param year the year given
  *@return the number of days for this Month
  */
  public int nbDays(int year){
    if (this!=Month.fevrier || !Date.isbisextile(year)){
      return this.Nbjrs;
    }else{
      return this.Nbjrs +1;
    }

  }

  /* returns the next month
   *@return the next month
  */
  public Month next(){
    return Month.values()[(this.ordinal()+1)% Month.values().length ];
  }


}
