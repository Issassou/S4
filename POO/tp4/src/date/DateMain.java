package date;
import date.*;


class DateMain{

  public static void main(String[] args){

    System.out.println("beginning of main from date.Date");
        Date date_1 = new Date(31,Month.janvier,2010);
        Date date_2 = new Date(7,Month.mars,2008);
        Date date_3 = new Date(17,Month.mai,1997);
        Date date_4 = new Date(02,Month.fevrier,1951);
        System.out.println(date_1.tommorow());
        System.out.println(date_2.getday());
        System.out.println(date_2.getmonth());
        System.out.println(date_2.getyear());
        System.out.println(date_3.equals(date_1));
        System.out.println(date_1.nbDayslater(30));

        System.out.println("end of main from date.Date");


  }
}
