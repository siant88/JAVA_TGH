package iotest02;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		
		// "." 현재디렉터리를 말함
		File file = new File(".", "FileTest.java");
		System.out.println("파일의 경로는?"+ file.getPath());
		System.out.println("파일의 이름은?"+ file.getName());
		System.out.println("파일의 상위디렉터리는?"+ file.getParent());
		System.out.println("파일의 절대경로는?"+ file.getAbsolutePath());
		System.out.println("파일이 존재하냐?"+ file.exists());
	
		String[] listing = new File(".").list();
		System.out.println("현재 디렉터리 내용은?");
		for (int i = 0; i < listing.length; i++) {
			
			System.out.println(listing[i]);
		}
	
	
	
	
	}
	
}
