package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * �����̸�.txt ������ �о
 * ���� �̸��� ����
 */
public class FileReader01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/ap/�����̸�.txt" ;
		
		FileReader fileReader = null ;
		BufferedReader buffer = null ;
		
		try {
			fileReader = new FileReader(fileName) ;
			buffer = new BufferedReader(fileReader) ;
			
			String line = new String();
			
			while(true) {
				line = buffer.readLine();			
				if(line == null)break;
				
				String[] names = line.split(":");
				System.out.print(names[0]+"\t"); // ��ȣ
				System.out.println
				
				(names[1]+"\t"); // �����̸�
				// System.out.println(names[2]);
				
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
