package CodingTestBasic;

public class Algo07PrimeNumber {

	public static void main(String[] args) {
		int num = 13;
		boolean isPrimeNumber = true;
		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				isPrimeNumber = false;
			}
		}
		if (isPrimeNumber) {
			System.out.println(num + " It's prime number.");
		} else {
			System.out.println(num + " It's not prime number.");
		}
	}

}
