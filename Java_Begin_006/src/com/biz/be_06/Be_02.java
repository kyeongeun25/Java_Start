package com.biz.be_06;

public class Be_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strNation = "Republic of Korea" ;
		
		// strNation�� ���Ե� ���ڿ��� ���̸� ���� ( ��ĭ�� ���� )
		int len = strNation.length();	// length() : int - int���� �����Ѵ�. 
		System.out.println(len);
		
		strNation = "���ѹα�";
		System.out.println(strNation.length());
		
		// String.charAt(��ġ)
		// String���� ��ġ��° ����(����) �Ѱ��� return
		System.out.println(strNation.charAt(0));
		
		// begin�� end ���� �Ű������� �޾Ƽ�
		// begin �տ��� �ڸ���, end �տ��� �߶�
		// �߰��� �߸� ���ڿ��� return
		System.out.println(strNation.substring(0, 3));
		
		strNation = "Republic of Korea";
		
		// begin �տ��� �ڸ��� ������ ������ ���ڿ��� return
		System.out.println(strNation.substring(5));
		
		for(int i = 0 ; i < 17 ; i++) {
			System.out.println(strNation.substring(i));
		}
		
		// ���ڿ����� ���� �ѱ��ھ� �߶󳻰� �����ֱ�
		for(int i = 0 ; i < strNation.length() ; i++) {
			System.out.println(strNation.substring(i));
		}
		
		// ���ڿ����� 1���ھ� �߶� �����ֱ�
		for(int i = 0; i < strNation.length();i++) {
			System.out.println(strNation.charAt(i));
		}
		System.out.println();
		
		// ���ڿ����� 1���ھ� �߶� +1�� �Ѵ��� �����ֱ�
		for(int i = 0; i < strNation.length() ; i++) {
			System.out.print(strNation.charAt(i)+1);
		}
		System.out.println();
		

		// ������ A ���� Z ���� ASCII �ڵ带 ȭ�鿡 ǥ��
		for(char i = 'A'; i<'Z'; i++) {
			System.out.print(i+" : ");
			System.out.print((int)i);
			System.out.println();
		}
		
		// ���� 0���� 9���� ASCII
		for(char i = '0' ; i<='9';i++) {
			System.out.print(i+" : ");
			System.out.println((int)i);
		}
		
		for( char i = '0'; i<='z'; i++) {
			System.out.print(i + " : ");
			System.out.println((int)i);
		}
	}

}
