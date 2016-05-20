package com.newer.cn;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// \\
		File file = new File("D:/demo.txt");
		
		//ָ���ļ��Ƿ����
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
		
		//ɾ���ļ�
		file.delete();
		
		//����Ŀ¼
		File file1 = new File("D:/a/a1/a2");
		//file1.mkdir();//make directory
		//mkdir:��������Ŀ¼
		//mkdirs�������༶Ŀ¼�ṹ
		file1.mkdirs();
		
		//ֻ��ɾ����Ŀ¼
		file1.delete();
		

	}

}
