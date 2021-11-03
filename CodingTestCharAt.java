package CodingTestBasic;

/*
 * A program that uses charAt() to convert characters to numbers 
 * and adds them to output the result.
 * 
 * @auther David Paek
 */
public class CodingTestCharAt {
	public String solve(String num1, String num2) {
		int carry = 0;

		StringBuilder sb = new StringBuilder();

		int num1Length = num1.length() - 1;
		int num2Length = num2.length() - 1;

		while (num1Length >= 0 || num2Length >= 0) {
			int n1 = 0;
			int n2 = 0;

			if (num1Length >= 0) {

				n1 = num1.charAt(num1Length) - '0'; // String to int

			}
			if (num2Length >= 0) {

				n2 = num2.charAt(num2Length) - '0'; // String to int

			}
			int sum = n1 + n2 + carry;
			carry = sum / 10;
			sb.append(sum % 10);
			num1Length--;
			num2Length--;
		}
		if (carry != 0)
			sb.append(carry);
		// Should be added when there is a rounding at the top
		return sb.reverse().toString();
		// Since the numbers are counted from the back,
		// you have to turn them backwards.
	}

	public static void main(String[] args) {
		String num1 = "123";
		String num2 = "888";

		System.out.println(new CodingTestCharAt().solve(num1, num2));

	}

}
