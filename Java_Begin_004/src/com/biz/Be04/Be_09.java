package com.biz.Be04;

public class Be_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2���� ������ ���� ������ �����(����, �ʱ�ȭ)
		int intNum1 = 0 ;
		int intNum2 = 0 ;
		
		// make() �޼��带 ȣ���ؼ�
		// ������ ���� �Ҵ��� ����.
		
		// ���� ������ ���尪�� �ٸ� ������ �Ҵ�
		intNum1 = intNum2 ;
		// intNum2�� ����� ���� intNum1�� ����
		// 		>> �Ҵ�
		
		sum();
		intNum1 = make(30, 40);
		//intNum1 = make();
		System.out.println(intNum1);
		// 1. make() method�� �ִ°�? Ȯ��
		// 2. ()�ȿ� �ƹ��� �Ű������� ���°�? Ȯ��
		// 3. make() ȣ��
		// 4. make()�� return Ű���忡 ���ؼ�
		// 5. 10 �̶�� ������ �����ϰ�
		// 6. ����� 10�� intNum1 ������ �Ҵ�ȴ�.
		
		
	} // end main()
	
	// method�� ���� �� �߰��� ����� void Ű���忡 �ָ�!
	// void
	//		�ƹ��͵� ����� ���ٴ� ǥ��
	
	
	public static void sum() {
		System.out.println(30+40);
	}
	
	// make method�� ����鼭
	// void Ű���� ��ſ� int ���
	public static int make(int num1, int num2) {
		return num1+num2;
		// return 0;
		
		
	}

}
