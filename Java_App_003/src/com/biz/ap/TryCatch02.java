package com.biz.ap;

public class TryCatch02 {

	public static void main(String[] args) {

		try {
			
			System.out.println(Integer.valueOf(" 10"));
			
		} catch (Exception e) {
			// TODO: handle exception
			// e.printStackTrace();
			// 임의로 exception handling을 처리하지 않으면
			// 내부에서 자동으로 호출되는 method
			// 그러므로 일부러 사용 할 필요 없다.
			
			System.out.println("숫자로 변환 할 수 없음");
		
		}

	}

}
