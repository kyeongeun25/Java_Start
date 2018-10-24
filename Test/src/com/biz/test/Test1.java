package com.biz.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {

		String fileName = "src/com/biz/test/data.txt";
		FileReader fileReader = null;
		BufferedReader buffer = null ;

		String[] words = null;
		List<String> list = null;
		String line = new String();
		
		try {
			fileReader = new FileReader(fileName) ;
			buffer = new BufferedReader(fileReader) ;
			line = buffer.readLine();
			words = line.split("");
			list = new ArrayList<String>(Arrays.asList(words));
			
			
			for(int i = 0 ; i < list.size() ; i++) {
				Collections.shuffle(list);
				System.out.println(list.get(0));
			} 
			}
			catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
