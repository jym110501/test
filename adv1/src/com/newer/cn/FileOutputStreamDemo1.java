package com.newer.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(file,true);
			String str = "�ú�ѧϰ����������";
			byte[] buf = str.getBytes();
			fos.write(buf);
			fos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
