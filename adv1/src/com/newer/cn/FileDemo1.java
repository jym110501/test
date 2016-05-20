package com.newer.cn;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class FileDemo1 {

	public static void main(String[] args) {

		File file = new File("D:\\Program Files\\Java\\jdk1.7.0_80");
		// 查找当前路径下所有的文件
		File[] fs = file.listFiles();

		for (File f : fs) {
			System.out.println(f.getName());

		}

		// List<String> list = new ArrayList<>();
		// list.add("aaa");
		// list.add("bbb");
		// for(String str : list){
		// System.out.println(str);
		// }
		// for(int i = 0;i < list.size();i++){
		// System.out.println(list.get(i));
		// }

		File[] files = file.listFiles(new FileFilter() {

			@Override
			public boolean accept(File f) {
				return f.isFile() && f.getName().endsWith(".txt");
			}
		});
		System.out.println("======================");
		for (File f : files) {
			System.out.println(f.getName());

		}
	}

}
