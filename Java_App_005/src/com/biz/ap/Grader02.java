package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * ����ǥ.txt ������ �о
 * �ݷ�(:)�� �������� ���ڿ��� �и��ϰ�
 * �� �л��� 3���� ������ ����� ����ؼ�
 * ȭ�鿡 ��� �� ����.
 * 
 */
public class Grader02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/ap/����ǥ.txt" ;
		
		FileReader fileReader = null ;
		BufferedReader buffer = null ;
		
		
		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			String line = new String();
			
			while(true) {
				line = buffer.readLine();
				if(line == null) break ;
				String[] names  = line.split(":");
				int cnt = 0;
				int intNum = 0 ;
				int intSum = 0;
				
				for(int i = 2 ; i < names.length ; i++) {
					intNum = Integer.valueOf(names[i]);
					intSum += intNum ;
					cnt ++;
				}
				
			
				System.out.print(names[0]+"\t");
				System.out.print(names[1]+"    "+"\t");
				System.out.print("���� : " + intSum+"\t");
				System.out.println("��� : " + intSum/cnt);
				
				
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
