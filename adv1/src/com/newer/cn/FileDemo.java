package com.newer.cn;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// \\
		File file = new File("D:/demo.txt");
		
		//指定文件是否存在
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length());
		System.out.println(file.lastModified());
		
		//删除文件
		file.delete();
		
		//创建目录
		File file1 = new File("D:/a/a1/a2");
		//file1.mkdir();//make directory
		//mkdir:创建单个目录
		//mkdirs：创建多级目录结构
		file1.mkdirs();
		
		//只能删除空目录
		file1.delete();
		

	}

}
