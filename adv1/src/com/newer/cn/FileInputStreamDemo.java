package com.newer.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		File file = new File("a.txt");

		try {
			FileInputStream fis = new FileInputStream(file);

			int r = fis.read();

			while (r != -1) {
				System.out.print((char) r);
				r = fis.read();
			}
			// ¹Ø±ÕÁ÷
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
