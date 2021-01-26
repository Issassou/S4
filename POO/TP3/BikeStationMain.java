public class BikeStationMain{
    public static void main(String[] args){
        BikeStation timo = new BikeStation("Timoleon",10);
        Bike b1 = new Bike("b001",BikeModel.CLASSICAL);
        Bike b2 = new Bike("b002",BikeModel.ELECTRIC);
        timo.dropBike(b1);
        timo.dropBike(b2);
        if(args.length == 0){
            System.out.println("You have to enter a position, please try again");
       }else{
            for(int i = 0; i < args.length; i++){
                Bike b3 = timo.takeBike(Integer.parseInt(args[i])-1);
                if(b3 != null){
                  System.out.println("\n The ID of the bike taken at position "+(Integer.parseInt(args[i])-1)+" is: "+b3.getId()+", Its rantal price is : "+b3.gedtDayPrice()+" euros");

                }else
                {
                  System.out.println("\n Sorry, there is no available bike at the position "+ args[i]);
                }
            }
          }
        }

}
