package iotest02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamTest {

	public static void main(String[] args) {
		FileInputStream fis =null;
		FileOutputStream fos =null;
		BufferedInputStream bis=null;;
		BufferedOutputStream bos=null;;
		
		int data = -1;
		long start=0, end=0;
		
		fis=new FileInputStream();
		fos=new FileOutStream();
		start=System.currentTimeMillis();
		while((data=fis.read())!=-1) {
			fos.write(data);
		}
		fos.flush();
		fis.close();
		fos.close();
		end=System.currentTimeMillis();
	}
}
