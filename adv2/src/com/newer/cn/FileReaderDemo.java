package com.newer.cn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		
		File file = new File("read.txt");
		
		try {
			FileReader fr = new FileReader(file);
			
			BufferedReader br = new BufferedReader(fr);
			
			String data = br.readLine();//读取一行数据
			
			BufferedReader br1 = new BufferedReader(
					new FileReader(new File("read.txt")));
			
			while(data != null){
				System.out.println(data);
				data = br.readLine();
			}
			//关闭流
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
