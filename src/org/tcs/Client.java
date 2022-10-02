package org.tcs;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Client {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\java\\selinium\\");
		boolean mkdir = file.mkdir();
		System.out.println(mkdir);
		
		boolean mkdirs = file.mkdirs();
		System.out.println(mkdirs);
		
		File file1 = new File("D:\\java\\selinium.txt");
		boolean createNewFile = file1.createNewFile();
		System.out.println(createNewFile);
		
		FileUtils.write(file, "welcome to java class");
		List<String> readLines = FileUtils.readLines(file1);
		
		for (int i = 0; i < readLines.size(); i++) {
		String x = readLines.get(i);
		System.out.println(x);
			
			
		}
		
		
	}

}
