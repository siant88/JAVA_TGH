package arrayex;

public class ArrayTest01 {

	
	public static void main(String[] args) {
		
		
		int[] num = new int [5];
		int[] values = {1,2,3,4,5,6,7,8,};
		//char[] ch = new char[5];
		char[] ch = {'a', 'b','c','d','e'};
//		ch[0] = 'a';
//		ch[1] = 'b';
//		ch[2] = 'c';
//		ch[3] = 'd';
//		ch[4] = 'e';
				
		for (int i = 0; i < ch.length; i++) {
			
			System.out.println("ch"+ "["+ i + "] : "+ ch[i] );
			
		}
		
		System.out.println("===============================");
		
		num[0] = 100; // int num1=100;
		num[1] = 200; // int num2=200;
		num[1] = (int)12.345f;
		num[2] = 300; // 배열은 고정된 값을 가지기 때문에 에러가 난다
		
		System.out.println("num[0]: " + num[0]);
		System.out.println("num[1]: " + num[1]);
		System.out.println("num[2]: " + num[2]);
		
		System.out.println("===============================");
	
		int sum = num[0]+num[1];
		System.out.println("합=" + sum);
		int add= num[0]+100;
		int sub= num[0]-50;
		int mul = num[0]*num[1];
		
		System.out.println("add : "+ add+ "\n"+ "sub : " + sub +"\n"+  "mul : "+ mul);
		
		System.out.println("===============================");
		
		int len =num.length;// 배열의 개수 
		System.out.println("배열의개수 : "+ len);
		
		for(int i =0; i<num.length; i++) {
			
			System.out.println("num"+"["+i+"]"+":" + num[i]);
			
		}
		
		
		
		
		
		
		
	}
	
	
}
