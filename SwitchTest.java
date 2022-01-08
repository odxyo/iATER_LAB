package bagicStudy.calculator;

public class SwitchTest {

	public static void main(String[] args) {
		
		int getUp = (int)(Math.random()*5+6);
		
		System.out.println("It's  "+getUp);
		
		switch(getUp){
			
			case 6: System.out.println("still Early!"); break;
			
			case 7: System.out.println("It's Get Up Time!"); break;
			
			case 8: System.out.println("Get Up! Hurry up!"); break;
			
			default: System.out.println("It's too late"); break;
			
		}
		
		
	}

}
