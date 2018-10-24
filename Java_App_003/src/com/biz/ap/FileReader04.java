package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/ap/data1.txt";

		// fileReader ó�� try catch���� ���� ������ ��� 
		// try�� �����ϱ� ���� ��ü, ���� ���� �̸� ������ �δ� ���� ����.
		FileReader fileReader = null;
		BufferedReader buffer = null;
		int intSum = 0;
		
		try {
			// �����ڸ� ���� �� �� exception�� �߻��ϹǷ� 
			// fileReader�� ������ �̸� �صΰ� 
			// �����κи� try ���� ������ �����Ѵ�.
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			String line = new String();
			
			while(true) {
				line = buffer.readLine();
				if(line == null)break;
				intSum += Integer.valueOf(line);
			}
			buffer.close();
			fileReader.close();
			
		}/* catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		// catch Exception�� ����� �־
		// ���� ����� handling�� �Ʒ��� �־�� �Ѵ�.
		// ���� ����� ���ʿ� ������
		// ���� ����� �ٸ� handling�� ��� ������ ������.
		} */ catch(Exception e) {
			
		}
		System.out.println("�հ� : "+intSum);
	}

}
