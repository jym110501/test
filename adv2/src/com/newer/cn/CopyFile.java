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
		//Դ�ļ�
		File srcFile = new File("read.txt");
		//Ŀ���ļ�
		File destFile = new File("copyread.txt");
		
		try {
			//����������Դ�ļ��ж�ȡ����
			BufferedReader br = new BufferedReader(
					new FileReader(srcFile));
			
			//��������Ѵ�Դ�ļ��ж�ȡ������д�뵽Ŀ���ļ���
			BufferedWriter bw = new BufferedWriter(
					new FileWriter(destFile,true));
			
			//��ȡһ������
			String data = br.readLine();
			//�ж��Ƿ��ļ���ȡ���
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
