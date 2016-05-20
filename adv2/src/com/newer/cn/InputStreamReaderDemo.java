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
			System.out.println("请输入姓名:");
			String name = br.readLine();
			System.out.println("请输入年龄:");
			int age = Integer.parseInt(br.readLine());
			System.out.println("你输入的姓名是:"+name);
			System.out.println("你输入的年龄是:"+age);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
