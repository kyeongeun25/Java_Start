package com.biz.b02;

public class Be_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ݺ��� 
		int i=0;
		for(i=0; // 1. ���ʿ� i�� 0���� reset�ϰ�
				i<10; // 2. i�� 10���� ������ ����
				i++) { // 5. i�� 1����
			 
			// 3. i < 10 = true �̸�
			//   �����ϰ�
			// 4. �ٽ� for�� �ö󰡼�
		}
		// i�� 10�̵Ǹ� ��

		for(i=0;i<10;i++) {
			System.out.println(i);
		}
		// Ƚ���� ������ �ݺ���
		
		int intSum = 0;
		for(i=0;i<10;i++) {
			intSum = intSum+1;
			
		}
		System.out.println(intSum);
		
		intSum = 0;
		for(i=0;i<10;i=i+1) {
			intSum++;
			// 1�� ������ų �� 
			// �÷���(+) ��ȣ�� �� �� �����ؼ� ����Ѵ�.
		}
		System.out.println(intSum);
		
		
	}

}
