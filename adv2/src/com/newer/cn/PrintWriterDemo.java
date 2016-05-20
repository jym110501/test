package com.newer.cn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;


public class PrintWriterDemo {

	public static void main(String[] args) {
		try {
			// 不带自动刷新功能
			PrintWriter pw = new PrintWriter(
					new FileOutputStream(new File("test.txt"),true));
			pw.print("xxxxx");
			pw.print("中国");
			pw.flush();
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
