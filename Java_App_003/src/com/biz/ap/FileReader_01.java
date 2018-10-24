package com.biz.ap;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "src/com/biz/ap/data.txt" ;
		
		try {
			// ���� ����
			FileReader fileReader = new FileReader(fileName);
			// ���������� ������ ������
			// fileReader�� �ü���� �б� �ڵ� ���̿���
			// ���� ����, ���� ������ ��ȯ �� �� �ֵ��� ������ �Ѵ�.
			
			// ���� �б�
			// 1. ������ ���� �� �о ���ڿ��� �����ϱ� ����
			//		���ڿ� ������ ����
			// String line = "";		// 1.8 �̻󿡼��� ����
			String line = new String();
			
			// 2. ���� �б� ���� �غ�
			// 		fileReader.read()�� ���Ϸ� ���� �ڵ� ������ �б� ������ �Ѵ�.
			// 		�о� ���� �ڵ带 ������ ���ڿ��� ��ȯ��Ű�� ����
			//		�� �ٸ� Ŭ������ ������ �޾ƾ� �Ѵ�.
			// line = fileReader.read();
			BufferedReader buffer = new BufferedReader(fileReader);
			
			// fileReader�� ���� ������ ��� �о BufferedReader���� �������ְ�
			// BufferedReader�� ���� ������ ���ڿ� ���·� �ٲپ buffer�� ������ ���´�.
			
			
			while(true) {
				// 3. ���� �� �б�(���ٸ�)
				// buffer.readLine()�� �ѹ� ���� �� ������
				// buffer�κ��� ���� �� �о line������ ����
				line = buffer.readLine();
				if(line == null) break;
				// 4. ���� ���� �ֿܼ� ǥ��
				System.out.println(line);
		
			}
			
				
			// System.out.println(buffer.readLine());
			// System.out.println(buffer.readLine());
			// System.out.println(buffer.readLine());
			
			// �ֽ� �ڹٿ����� �ڵ����� close�� ��Ű����
			// ������ close() �޼��带 ���� �� �ִ� ���� ����.
			// ���� ���� buffer >> fileReader ������ �ݴ� ���� ����.
			buffer.close();
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(fileName + "������ ���׿�");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("���� �б� �� ���� �߻�");
		}
		
	}

}
