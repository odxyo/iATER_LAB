                                           package CodingTestBasic;

public class Algo14CountNumber {

	public static void count(int n) {
		int arr[]= new int[10];
		
		while(n>0) {
			arr[n%10]++;
			n/=10;
		}
		for(int i=0; i<10;i++) {
			System.out.println(i+" : " +arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		count(11231);

	}

}
