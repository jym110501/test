package com.newer.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo1 {

	public static void main(String[] args) {
		
		File file = new File("read.txt");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			byte[] buf = new byte[(int)file.length()];
			
			//一次性把文件中的数据读取到buf中
			fis.read(buf);
			
			String data = new String(buf);
			System.out.println(data);
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
