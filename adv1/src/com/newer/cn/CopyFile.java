package com.newer.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		//Դ�ļ�
		File srcFile = new File("read.txt");
		//Ŀ���ļ�
		File destFile = new File("readcopy.txt");
		
		byte[] buf = new byte[(int)srcFile.length()];
		
		try {
			FileInputStream fis = new FileInputStream(srcFile);
			
			FileOutputStream fos = new FileOutputStream(destFile);
			
			fis.read(buf);
			
			fos.write(buf);
			
			System.out.println("�����ļ����");
			
			fos.close();
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
