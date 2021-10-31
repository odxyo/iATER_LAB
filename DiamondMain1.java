package bagicStudy;

import java.util.Scanner;

public class DiamondMain1 {

	public static void main(String[] args) {
		
		System.out.println("Enter the line number(an odd):");
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		sc.nextLine();
		
		Diamond1 diamond1 = new Diamond1(size);
		
		diamond1.print();
			

	}

}
