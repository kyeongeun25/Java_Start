package com.biz.ap;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 2018.jpeg �׸������� �о 
 * �ٽ� 2018_copy.jpeg ���Ͽ� ���
 * 
 * >>> ���� �����ϱ�
 */
public class Ap_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sourceFile = "src/com/biz/ap/2018.jpg" ;
		String targetFile = "src/com/biz/ap/2018_copy.jpg" ;
		
		// ���� �б� Ŭ���� ����
		FileInputStream fi = null ;
		BufferedInputStream bInput = null ;
		
		// ���� ��� Ŭ���� ����
		FileOutputStream fo = null ;
		BufferedOutputStream bOut = null ;
		
		
		try {
			// �б� Ŭ���� ����
			fi = new FileInputStream(sourceFile) ;
			bInput = new BufferedInputStream(fi) ;
		
			// ��� Ŭ���� ����
			fo = new FileOutputStream(targetFile);
			bOut = new BufferedOutputStream(fo);
		
			// �б�� byte �迭�� ����
			byte[] reader = new byte[1024] ;			// 1Kbyte ������ �����Ѵ�.
			
			// byte�� 1Kbyte ���� �̹Ƿ� �ݺ����� �̿��ؼ� ������ �о� �鿩�� �Ѵ�.
			while(true) {
				// ������ �������� ������ 1024�� return
				// ������ �� �о����� -1�� return
				if(bInput.read(reader) < 0) break;
				
				// ���� ������ ���
				bOut.write(reader);
			}
			
			// �б���� ��� �� ���� �ʾƵ� ū ������ ������
			// ��Ͽ��� �ݵ�� flush() �ϰ�, �ݾ� �־�� �Ѵ�.
			bOut.flush();
			bOut.close();
			fo.close();
			
			
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
