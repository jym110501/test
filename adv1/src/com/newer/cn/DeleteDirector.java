package com.newer.cn;

import java.io.File;

public class DeleteDirector {
	
	public static void del(File f){
		//f���������е��ļ���ѯ����
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
