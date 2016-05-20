package com.newer.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		
		File file = new File("test.txt");
		
		try {
			//false:替换文件中的数据
			//true：在文件元数据的基础上追加
			FileOutputStream fos = new FileOutputStream(file,true);
			
			String str = "hello world";
			for(int i = 0;i < str.length();i++){
				fos.write(str.charAt(i));	
			}
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
