/* 
 * 사각형 면적 구하기 
 * SquareApp에서 먼저 length와 area 변수를 만드는데 area는 매소드로 값을 구한다. 
 * 
 */


package bagicStudy;

public class SquareTest {

	public static void main(String[] args) {
	
			SquareApp s1 = new SquareApp();
			
			s1.length = 5;
			
			
			System.out.println("The area of this rectangle is "+s1.area()+"m^2");

	}

}
