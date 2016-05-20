package com.newer.cn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) {
		//源文件
		File srcFile = new File("read.txt");
		//目标文件
		File destFile = new File("copyread.txt");
		
		try {
			//输入流：从源文件中读取数据
			BufferedReader br = new BufferedReader(
					new FileReader(srcFile));
			
			//输出流：把从源文件中读取的数据写入到目标文件中
			BufferedWriter bw = new BufferedWriter(
					new FileWriter(destFile,true));
			
			//读取一行数据
			String data = br.readLine();
			//判断是否文件读取完毕
			while(data != null){
				bw.write(data);
				bw.newLine();
				data = br.readLine();
			}
			bw.close();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
