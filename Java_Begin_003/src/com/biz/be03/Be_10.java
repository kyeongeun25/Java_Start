package com.biz.be03;
/*
 * �޼���(method)
 * 		�����ϰ�, �ݺ��Ǵ� �ڵ带 main �ܺο� ������ �����ϰ�
 * 		main���� ȣ���Ͽ� ����ϴ� ���
 * 
 * �޼��� ����
 * 		�޼��� �̸�()
 * 		- ���� �̸� ����� ����.
 * 		- ù���� �ҹ���
 * 		- ���Ŀ��� ������, ����, _
 * 		- �� ������ ()�� ���´�.
 * 		- ��ȣ�ȿ��� ������ ���� �� �� �ִ�.
 * 			>> ��ȣ���� ������ Ư���� "�Ű�����, �Ķ����" ��� �Ѵ�.
 * 
 * ȣ���ϴ� �������� �޼����� �Ű������� ����
 * 		��, ������ �����Ѵ�.
 * 		- ȣ���ϴ� ������ �����ϴ� ���� ���� "�ƱԸ�Ʈ"��� �Ѵ�.
 * 		- ȣ���ϴ� ������ �����ϴ� ������ ���� 
 * 		- �޼��� ������ �� ���� ���� ����, ���°� ���ƾ� �Ѵ�.
 * 
 */
public class Be_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(1,100);
		sum(100,1000);
		sum(5, 50);
		sum(0,100,2); // ¦���� ��
		sum(1,100,2); // Ȧ���� ��
		sum("Ȧ���� ��",1,100,2);
		sum("¦���� ��",0,100,2);
		
		for( int i=1;i<10;i++) {
			for(int x=5-i;x>0;x--) {
				System.out.print(" ");
			}
			for(int y=1;y==i;y+=2) {
				if(y%2!=0) {
					System.out.println("*");
					
				}
			}
		}
	}

	// �Ű������� ���� method
	public static void sum() {
		
	}
	
	// �Ű������� ������ 2�� �ִ� method
	public static void sum(int num1, int num2) {
		
		int intSum = 0;
		for(int i=num1; i<num2; i++) {
			intSum += i;
			
		}
		System.out.println(num1+"���� "+ num2 + "������ �� : "+intSum);
	}
	
	// �Ű������� ������ 3�� �ִ� method
	public static void sum(int start, int end, int step) {
		int intSum = 0;
		for(int i =start; i<=end;i +=step){
			intSum+=i;
		}
		System.out.println("�� : "+intSum);
	}
	
	// �Ű������� ���ڿ��� 1��, ������ 3�� �ִ� method
	public static void sum(String title, int start, int end, int step) {
		int intSum = 0;
		for(int i = start ; i<=end; i+= step) {
			intSum += i;
		}
		System.out.println(start+"���� "+end+"������ "+title+"="+intSum);
	}
}
