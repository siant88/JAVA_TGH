package arrayex;

public class ArrayTest06 {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		int len = num.length;
		
		int temp = 0;
		
		System.out.println("교환 전 배열 요소 값");
		
		for (int i = 0; i <len; i++) {
			
			System.out.print(num[i]+ "\t");
			
		}
		
		for (int i = 0; i < len/2; i++) {
			
			temp=num[i]; //  1 2 3 4 5템프에저장
			num[i]=num[len-1-i]; //넘 12345를 10 9 8 7 6 저장
			num[len-1-i]=temp;//넘 10 9 8 7 6 을 1 2 3 4 5 가져옴
			
		}
		
		System.out.println("\n교환 후 배열 요소 값");
		
		for (int i = 0; i <len; i++) {
			
		System.out.print(num[i]+"\t");	
		}
		
		
	}
	
	
	
}
