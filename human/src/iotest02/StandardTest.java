package iotest02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardTest {

	public static void main(String[] args) {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		String msg = null;
		System.out.println("Exit:ctrl-z");
		try {
			msg=in.readLine();
			while(msg!=null) {
				System.out.println("읽기"+msg);
				
			}
			
			in.close();
			ir.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			
			
		}
		
	}
	
}
