package CodingTestBasic;

public class Algo10NbyN {

	public static void main(String[] args) {
		int n = 5;
		/* n=3
		 * 123
		 * 456
		 * 789
		 */
		// int a=1;
		
		for(int j=0; j<=n ;j++) {
			for (int i =0; i <n; i++){
				System.out.printf("%d ",j*n+i+1);
				// System.out.print(j*(n)+i+1+ "   ");
				// a++;
			}
			System.out.println();
		}

	}

}
