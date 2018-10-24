package com.biz.be_06;

/*
 * JDK�� �̹� ������� �ִ� method����
 * ���� ��� ������
 * 
 * JDK�� �̹� ������� �ִ� method����
 * ����Ϸ��� Ŭ������� ������ �˾ƾ� �ϴµ�,
 * �ϴ� Ŭ������� ���� �ǳʶٰ�
 * 
 * JDK�� �ִ� method�� ����(include), �ý���(system) method��� �Ѵ�.
 */
public class Be_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("���� �ڶ�������");
		
		// int, float �� �ҹ��ڷ� ���۵Ǵ� Ű���� = �����(Resolved word)
		// ������ ����� ������ ���� �����ϰ� �д� �뵵�θ� ���
		int intNum = 0;
		float fNum = 0.0f;
		
		// fNum : ���� �����ϴ� �뵵
		// intNum : ���� �д� �뵵
		fNum = intNum ;
		
		// � Ű���� ù ���ڰ� �빮�ڷ� ���۵Ǹ�
		// �װ��� class��� �θ���.
		// Ŭ������ ����� ������ JDK ���ο��� �پ��� method����
		// ÷���Ͽ� ������ �����.
		// ������ ���� ����, �д� �뵵 �ܿ� �پ��ϰ� ���� �� �ִ�.
		String strName = "Republic of Korea";

		// Ŭ������ ���ο� ����, �پ���, �������� method���� �����ϰ� �ִ�.
		// String Ŭ������ ����� ������ ���ؼ� 
		// String�� ���Ե� �پ��� method���� ����غ���
		// ������.method() �������� ��� �� �� �ִ�.
		System.out.println(strName);
		System.out.println(strName.toUpperCase());
			// String.toUpperCase() �޼���� 
			// ���ڿ� ������ ����� �����ڸ� 
			// ��� �빮�ڷ� �ٲپ return
		
		System.out.println(strName.toLowerCase());
		
		// ���ڿ� ��
		String t = "Korea";
		if(t=="Korea") {
			System.out.println("���ѹα�");
		}
		// >> ���ڿ� ������ ���� ���ϰ��� �� ��,
		// 		==�� ������� �ʴ´�.
		
		// ���ڿ� ������ ���� ���ϰ��� �� ����,
		// String�� ���Ե� method�� ����ؾ� �Ѵ�.
		
		if(t.equals("Korea")) {
			System.out.println("���ѹα�");
		}
		// >> String.equals() method��
		// ���ڿ� ������ �ִ� ���� ���ϰ��� �� ��
		// ����ϴ� �޼����̴�.
		// String�� ���Ե� ���� �Ű������� ���޵� ���� ������
		// true�� �����Ѵ�.
		
		if(t.equals("Korea")==true) {
			System.out.println("���ѹα�");
		}
		
		// �����ڴ� ��ҹ��ڰ� ���� �ٸ� ���ڷ� �νĵȴ�.
		// ��ҹ��ڰ� �ٸ��� �ٸ� ���ڿ��̴�.
		if(t.equals("KOREA")) {	
			System.out.println("���ѹα�");
		}else {
			System.out.println("�۽�");
		}
		
		// ��ҹ��ڿ� ������� ������ �ϰ� ���� ��
		if(t.equalsIgnoreCase("korea")) {
			System.out.println("����");
		}else {
			System.out.println("No!");
		}
		// equals�� ��ҹ��ڰ� ��Ȯ�� ��ġ�ؾ� true
		// equalsIgnoreCase�� ��ҹ��� ������� 
		//		���ڸ� ��ġ�ϸ� true
		
		if(t.equalsIgnoreCase("KOREA")) {
			System.out.println("yes");
		}else {
			System.out.println("nono");
		}
		
		// ���ڿ��� �̿��ؼ� �񱳸� �ϰų� 
		// � ���� �˻�(ã��)�� �� ��
		// ���ڿ� ��, �ڿ� ���ǽ��߿� �߰��� " "��
		// �񱳸� Ʋ�� ������ �ν��Ѵ�.
		if(t.equalsIgnoreCase(" Korea ")) {
			System.out.println("yesyes");
		}else {
			System.out.println("nonono");
		}
		
	}

}
