package com.newer.cn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDirectory {

	public static void copyFile(File src, File dest) {
		try {
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(dest);

			byte[] buf = new byte[(int) src.length()];
			fis.read(buf);
			fos.write(buf);
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

	/**
	 * 复制目录
	 * 
	 * @param args
	 */
	public static void copyDir(File srcFile, File destFile) {
		destFile.mkdir();
		File[] fs = srcFile.listFiles();
		for (File file : fs) {
			if (file.isFile()) {
				copyFile(file, new File(destFile.getAbsolutePath() + File.separator + file.getName()));
			}

			// D:/java/jdk/db
			// F:/jdk/
			if (file.isDirectory()) {
				copyDir(new File(srcFile.getAbsolutePath() + File.separator + file.getName()),
						new File(destFile.getAbsolutePath() + File.separator + file.getName()));
			}
		}

	}

	public static void main(String[] args) {

		String source = "D:/Program Files/Java/jdk1.7.0_80";
		String target = "F:";

		File srcFile = new File(source);
		// F:/jdk1.7.0_80/bin
		File destFile = new File(target + File.separator + srcFile.getName());
		destFile.mkdir();

		// 得到源目录下所有的文件
		File[] files = srcFile.listFiles();
		for (File f : files) {
			System.out.println(f.getName());
			if (f.isFile()) {
				// 复制文件
				copyFile(f, new File(destFile.getAbsolutePath() + File.separator + f.getName()));
			}
			if (f.isDirectory()) {
				copyDir(new File(srcFile.getAbsolutePath() + File.separator + f.getName()),
						new File(destFile.getAbsolutePath() + File.separator + f.getName()));
			}
		}
	}

}
