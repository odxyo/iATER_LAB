package CodingTestBasic;

public class CapToLow {

	public static void main(String[] args) {
		
		String input = "HelloWorlD";
		char []arr;
		
		arr = input.toCharArray();
		
		for (int i=0; i < arr.length; i++ ) {
			if(arr[i]>='a' && arr[i] <='z' ) {
				arr[i] = (char) (arr[i] +'A'-'a'); // a,b,c,d,e...z A,B,C			
			}
			else if(arr[i] >='A'&& arr[i]<='Z') {
				arr[i] = (char) (arr[i] -('A'-'a')); // a,b,c,d,e...z A,B,C
			}
		}
		System.out.println(arr);

	}

}
