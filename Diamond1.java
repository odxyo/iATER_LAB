package bagicStudy;
/*
 * Diamond class
 * 
 * @auther David Paek
 * 
 */

public class Diamond1 {
	
	private final int size;
	private final int halfSize;
	
	public Diamond1(int size) {
		this.size =size;
		this.halfSize=size/2;
		
	}
	
	/*
	 * this method is for printing Diamond,,,,,,,,,,
	 * 
	 */
	
	public void print() {
		int star =(int)halfSize;  // halfkkjjjjlljjkjljlkj
		for(int i=0; i <size; i++) {
			for (int j =0; j <size; j++) {
				if(star- Math.abs(star-i) >= Math.abs(star-j)) {  //ddddd
					System.out.print("*");  
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
	}
	

}
