package com.biz.ap;

public class TryCatch02 {

	public static void main(String[] args) {

		try {
			
			System.out.println(Integer.valueOf(" 10"));
			
		} catch (Exception e) {
			// TODO: handle exception
			// e.printStackTrace();
			// ���Ƿ� exception handling�� ó������ ������
			// ���ο��� �ڵ����� ȣ��Ǵ� method
			// �׷��Ƿ� �Ϻη� ��� �� �ʿ� ����.
			
			System.out.println("���ڷ� ��ȯ �� �� ����");
		
		}

	}

}
