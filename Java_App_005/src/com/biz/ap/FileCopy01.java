package com.biz.ap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �����̸�.txt������ �о
 * �����̸��� �����ؼ�
 * �����̸�.txt���Ͽ� ����
 */
public class FileCopy01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String readFile = "src/com/biz/ap/�����̸�.txt" ;
		String writeFile = "src/com/biz/ap/�����̸�.txt" ;
		
		// �б�� Ŭ����
		FileReader fileReader = null ;
		BufferedReader rBuffer = null ;
		
		// ����� Ŭ����
		FileWriter fileWriter = null ;
		BufferedWriter wBuffer = null ;
		
		try {
			fileReader = new FileReader(readFile) ;
			rBuffer = new BufferedReader(fileReader) ;
			
			fileWriter = new FileWriter(writeFile);
			wBuffer = new BufferedWriter(fileWriter);
			
			String line = new String();
			while(true) {
				line = rBuffer.readLine();
				if(line == null) break ;
				
				String names[] = line.split(":");
				
				// names[1] �����̸��� ����Ǿ� �ִ�.
				
				wBuffer.write(names[1]);
				wBuffer.newLine();
				
			}
			wBuffer.flush();
			wBuffer.close();
		
			fileWriter.close();
			rBuffer.close();
			fileReader.close();
			
			System.out.println("���� ���� �Ϸ�");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
