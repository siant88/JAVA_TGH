package Day02;

public class Ex19_GuguAll {

	public static void main(String[] args) {
		
		// (단) * (1~8)
		// 단에 대한 반복 : 2~9
		// 각 단에 곱 : 1~9
		// A * B
		// i : 단(A)
		
		for (int i = 2; i <=9; i++) {
			
			// j : 곱 (B)
			
			for (int j = 1; j <=9; j++) {
				System.out.print(i + "*" + j + "=" + i*j);
				System.out.print("\t");
				
				
			}
			
			// 2*1=2   
			System.out.println();  // 한단끝 --> 다음줄로
			
		}
		
		
	}
	
}
