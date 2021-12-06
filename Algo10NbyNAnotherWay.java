package CodingTestBasic;

public class Algo10NbyNAnotherWay {
kjkjljjj
	public static void main(String[] args) {
		int n = 6;
		int arr[][] = new int[n][n];
		/*
		 * 123 654 789
		 */

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				arr[i][j] = i * n + j + 1;
				
			}
			for ( int k = 0; k < n; k++) {
				for (int l = 0; l < n; l++) {
					System.out.printf("%4d", arr[k][l]);
				}
				System.out.println();
		}
	//	for (int i = 0; i < n; i++) {
	//		for (int j = 0; j < n; j++) {
	//			System.out.printf("%4d", arr[i][j]);
	//		}
	//		System.out.println();
	}

	}

}}
