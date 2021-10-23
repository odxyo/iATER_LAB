package bagicStudy;

public class Exam13 {

	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++) {
			for (int j = 6 - i; j > 0; j--) {
				System.out.printf(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.printf("*");
			}

			for (int l = 0; l < i - 1; l++) {
				System.out.printf("*");
			}
			System.out.println(" ");
		}
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.printf(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.printf("*");
			}
			for (int l = 0; l < 4-i; l++) {
				System.out.printf("*");
			}
			System.out.println(" ");
		}

	}
}
