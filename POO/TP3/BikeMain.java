

public class BikeMain {
		public static void main(String[] args){
			Bike b1 = new Bike("b001",BikeModel.CLASSICAL);
			Bike b2 = new Bike("b002",BikeModel.ELECTRIC);
			System.out.println(b1.equals(b2));
			System.out.println(b1.toString()+" et son prix :"+b1.gedtDayPrice());

		}
}
