package com.newer.cn;

import java.io.File;

public class DeleteDirector {
	
	public static void del(File f){
		//f对象下所有的文件查询出来
		File[] fs = f.listFiles();
		for(File fi : fs){
			if(fi.isFile()){
				fi.delete();
			}
			if(fi.isDirectory()){
				del(fi);
			}
			fi.delete();
		}
		f.delete();
	}

	public static void main(String[] args) {
		
		File file = new File("D:/a");
		del(file);
	}

}
