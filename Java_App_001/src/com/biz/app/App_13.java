package com.biz.app;

public class App_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money = 2785430 ;
		int x = 50000 ;
		int m = 0 ;
		int sw = 1;
		
		
		// for( ;; ){}
		// ���� �ݺ� for��
		
		// for�� ���� �ݺ����� �ƴϹǷ�
		// ���ѹݺ��� �ϰ��� �� ����
		// while(true)�� ����Ѵ�.
	
		 while(true){
			m = money / x;
			money -= m*x ;
			
			System.out.println(x + "���� "+m+"��");
			
			if(money < 10) {
				break;
			}
			
			if(sw==1) {
				x /= 5 ;
			} else {
				x /= 2;
			}
			
			sw *= -1;
		}
		 
		
		
		
	}

}
      