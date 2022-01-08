package bagicStudy.calculator;

public class Oddsum {
	
	
	public static void main(String[] args) {
		
		int x =0;
		
		for (int i =1; i <= 10;i++) {
			
			if(i%2==1) {
				
				x+=i;
				
			}
			
		}
		System.out.println("Odd sum from 1 to 10 is "+x);
	}

}


