package com.newer.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class PrintWriterDemo {

	public static void main(String[] args) {
		try {
			// �����Զ�ˢ�¹���
			PrintWriter pw = new PrintWriter(
					new FileOutputStream(new File("test.txt"),true));
			pw.print("xxxxx");
			pw.print("�й�");
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
