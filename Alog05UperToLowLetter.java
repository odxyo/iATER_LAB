package CodingTestBasic;

public class Alog05UperToLowLetter {

	public static void main(String[] args) {
		String input = "hElloWorlD";
		char[] arr;
		arr = input.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char) (arr[i] + 'A' - 'a'); // 'a' 'b' ~ 'z'

			}

			else if (arr[i] >= 'A' && arr[i] <= 'z') {
				arr[i] = (char) (arr[i] - ('A' - 'a'));
			}

		}
		System.out.println(arr);
	}
}
