
public class Venue {

	private boolean allSeats[][][];
	
	public Venue(int sections, int rows, int seats) 
	{
		allSeats = new boolean[sections][rows][seats];
		for (int i=0;i<sections;i++) {
			for(int j=0;j<rows;j++) {
				for(int k=0;k<seats;k++) {
					allSeats[i][j][k] = false;
				}//k
			}//j
		}//i
	}//Venue constructor
	
	
	public boolean seatLookup(int section, int row, int seat)
	{
		if(!allSeats[section][row][seat]) {
			allSeats[section][row][seat] = true;
			return false;}
		else
			return true;
	}//seatLookup
	
}//Venue