package Score;

import java.util.Iterator;

public class Score {
	
	
	
	
	public int[] processGrades() {
		
		 int[] arr = {87,68,94,100,83,78,85,91,76,87};
		 return arr;
	}
	
	public  void displayMessage() {
				System.out.println("Java Programming\n점수:\n배열 초기값");
	}
	
	public  void studentArray(int arr[]) {
		int v = 1;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("학생 "+ v++ +": "+arr[i]);
		}
		
	}
	
	public  void avg(int arr[]) {
		float avg = 0;
		 int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
		    sum += arr[i];	
		}
		avg = (float)sum/arr.length;
		System.out.println();
		System.out.printf("과목평균"+"%.2f",avg);
		
	}
	
	public void minmax(int[] arr) {
		 int min = arr[0];
		 int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) if (arr[i]>max) max = arr[i];
		for (int i = 1; i < arr.length; i++) if (arr[i]<min) min = arr[i];
		
		System.out.println("\n최저점수 "+min);
		System.out.println("최고점수 "+max);
		
		
	}
	
	public void Sort(int[] arr) {
		
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i]>arr[j]) { 
					temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;}
								
			}
	}
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	public void scoredis(int[] arr) {
		
		
		System.out.println("점수분포:");
		
		int[] arr2 = new int[10];
		
		for (int i = 0; i < arr2.length; i++) {
			arr[i] = arr[i]/10;
		}
		
		
		for (int i = 0; i < arr2.length; i++) {
			
			System.out.println(i+"0-"+i+"9:");
		}
		
		System.out.println("100:");
		
	}
	
	public static void main(String[] args) {
		Score score = new Score();
		int[] arr = score.processGrades();
		score.displayMessage();
		score.studentArray(arr);
		score.avg(arr);
		score.minmax(arr);
		score.scoredis(arr);
		score.Sort(arr);
	}
	
	
	
	
}
