import java.util.Random;
public class VenueTester {

	public static void main(String[] args) {
		
		Venue prudentialCenter = new Venue(4,5,10);
		
		Random randomGen = new Random();
		
		for (int i=0;i<100;i++) {
			int section = randomGen.nextInt(4)+1;
			int row = randomGen.nextInt(5)+1;
			int seat = randomGen.nextInt(10)+1;
			
			prudentialCenter.seatLookup(section,row,seat);
			
			if(!prudentialCenter.seatLookup(section,row,seat))
				System.out.println("Seat " + section + "-" + row + "-" + seat + " is now taken");
			else
				System.out.println("Seat " + section + "-" + row + "-" + seat + " is unavailable");
			
		}//random seat loop
		
	}//main

}//VenueTester