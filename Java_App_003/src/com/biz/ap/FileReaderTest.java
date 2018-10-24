package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * data1.txt ������ �о
 * ���� ������ ��ȯ�ϰ� 
 * ��ü ������ �ϰ� 
 * ��ü ����� ����ϴ�
 * �ڵ带 �ۼ��� ���ϴ�.
 */
public class FileReaderTest {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/ap/data1.txt";
		
		FileReader fileReader = null ;
		BufferedReader buffer = null ;
		int intSum = 0 ;
		int cnt = 0;
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			String line = new String();
			
			while(true){
				
				line = buffer.readLine();
				if(line == null) break ;
				intSum += Integer.valueOf(line);
				cnt ++;
			}
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			
		}
		System.out.println("�հ� : "+intSum);
		System.out.println("��� : "+intSum / cnt);

	}

}
