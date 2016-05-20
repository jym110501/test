package com.newer.cn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) {
		// System.in = InputStream
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			System.out.println("����������:");
			String name = br.readLine();
			System.out.println("����������:");
			int age = Integer.parseInt(br.readLine());
			System.out.println("�������������:"+name);
			System.out.println("�������������:"+age);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
