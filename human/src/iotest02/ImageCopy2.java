package iotest02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ImageCopy2 {

	try {
		
		File file = new File("c:\\image\\gallery.png");
		FileInputStream in = new FileInputStream(file);
		FileOutputStream out = new FileOutputStream("c:\\image\\gallery_copy.png");
				int data;
		System.out.println("파일 크기는:"+file.length());
		long begin = System.currentTimeMillis();
		
		byte[] buffer=new byte[100];
		
		while(true) {
			int count=in.read(buffer);
			if(count==-1)break;
			out.write(buffer,0,count);
			
		}in.close();
		out.close();
		System.out.println("이미지를 복사했습니다.");
		
		long end = System.currentTimeMillis();
		System.out.println("복사시간은:"+ (end-begin)+"ms입니다.");
	} catch(Exception e) {
		
		e.printStackTrace();
		
	}

}