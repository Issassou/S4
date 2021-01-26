package date;
import date.Month;


public class Date {
    private int day;
    private Month month;
    private int year;

    /*Builds the Date class
     *@param d the day given
     *@param m the month given
     *@param y the year given
     *
    */
    public Date(int d,Month m,int y){
      this.day=d;
      this.month=m;
      this.year=y;
    }
    public Date(Date date){
      this(date.getday(),date.getmonth(),date.getyear());

    }


    /* returns the day 
     *@return the day
    */
    public int getday(){
      return this.day;
    }
    /* returns the month
     *@return the month
    */
    public Month getmonth(){
      return this.month;
    }
    /* returns the year
     *@return the year
    */
    public int getyear(){
      return this.year;

    }
   /*
   return the next day for today
   *@return the next days
   */
    public Date tommorow(){

      if(this.day==this.month.nbDays(this.year)){
        if( this.month==Month.decembre){
          return new Date(1,Month.janvier,this.year+1);

        }else{
          return new Date(1,this.month.next(),this.year);

        }

      }else{
        return new Date(this.day+1,this.month,this.year);
      }
    }

    /** 
    * @return True if two dates are equals false else
    * @param d the Date that we want to compare
    */
    public boolean equals( Object o){
      if (o instanceof Date){
        Date other =(Date) o;
        return this.day==other.day
        &&this.month ==other.month
        &&this.year ==other.year;
      }else{
        return false;
      }
 }


   /*
   return the next day after nbDays given
   *@param nbDays the number of days given 
   *@return the next day after nbDays given
   */
    public Date nbDayslater( int nbDays){
      if(nbDays<0){
         throw new IllegalArgumentException("nb de jours est negatif");
      }else{
        Date result=new Date(this);/*une copie de notre date*/
        for (int i=0;i<nbDays;i++){
          result=result.tommorow();
        }

      return result;
    }
    }
   /*
   *returns the difference of two days given
   *@param d the Date given
   *@return the difference of two days given
   */
  public int differenceINdays(Date d){
    int cpt=0;
    Date futur=new Date(this);
    Date paste = new Date(d);
    while(!futur.equals(d)&& !paste.equals(this)){
      cpt++;
      futur=futur.tommorow();
      paste=paste.tommorow();
    }
    if (futur.equals(d)) return cpt;
    else return -cpt;
  }

    /**
    * @see java.lang.Object#toString()
    */
  public String toString(){

    return this.day +" "+ this.month + this.year;
  }

    /**
    * returns TRUE or FALSE 
    *@param year : the year given 
    * @return TRUE if the two years are bisextile and FALSE if not .
    */
  public static  boolean isbisextile( int year){
    return ((year%400) == 0 || ((year%4 == 0) && year%100 != 0));


  }








}
