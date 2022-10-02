package org.tcs;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Company {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("D:\\Java\\Selenium\\Sql.txt");
		

	 boolean createNewFile = file.createNewFile();
	 
	 System.out.println(createNewFile);
	 
	 
	 FileUtils.write(file,"Welcome tio java class"+'\t'+"This is a oops class",true);
	 
	 List<String> readLines = FileUtils.readLines(file);
	 
	 System.out.println(readLines);
	
	 
	 for (int i = 0; i <readLines.size(); i++) {
		
		 
		 String string = readLines.get(i);
		 
		 System.out.println(string);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
		
		
		
		
		
		
		
		
		
			
		}
	}


