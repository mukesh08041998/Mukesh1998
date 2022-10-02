package org.tcs;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Sample {

	public static void main(String[] args) throws IOException  {
		
		File file = new File("D:\\java\\selinium\\Sql.txt");
		
		boolean createNewFile = file.createNewFile();
		
		System.out.println(createNewFile);
		
		FileUtils.write(file,"welcome to java class"+'\t'+"this is new class",true);
		
		List<String> readLines = FileUtils.readLines(file);
		
		System.out.println(readLines);
		
		
		for (int i = 0; i < readLines.size(); i++) {
			
			String string = readLines.get(i);
			
			System.out.println(string);
			
		}
		}
		
		
		}
			
		
		


