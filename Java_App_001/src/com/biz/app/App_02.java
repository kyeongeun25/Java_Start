package com.biz.app;
/*
 *  LOTTO ��ȣ ������
 */
public class App_02 {

	public static void main(String[] args) {
		// lotto ��ȣ�� ���� ������ �迭 6���� ����
		int[] lotto = new int[6];
		
		for(int i  = 0; i<lotto.length;i++) {
			int n = (int)(Math.random() * (45-1)+1);
			
			// ���� ��ȣ�� �����Ǿ��� Ȯ��
			if(numCheck(lotto,n)) {		
				// ���� i ��ġ�� ���� �ٽ� �����
				// �ϴ� i ���� 1 ���ҽ�Ű�� 
				// for�� �ٽ� �����Ѵ�.
				i -- ; // ���� ���� 3�̾��ٸ�, i�� 2�� �����
					// �ݺ����� �ٽ� �����϶�
				
				// �� ���� ��ȣ�� ������?
				// break; �ݺ����� ������
				continue;	// ������ ��ɵ��� ��� �ǳʶٰ� for�� �ٽ� ����
			}
			lotto[i] = n ; 
		}
		// ��ȣ�� �����ؼ� ��������.
		for(int i = 0 ; i < 6 ; i++) {
			for(int j = i; i<6;j++) {
				if(lotto[i] > lotto[j]) {
					int t = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = t;
				}
			}
		}
		
		
		for(int n : lotto) {
			System.out.print(n+" ");
		}
		

	}
	
	// �迭�� �Ű������� �����ϴ� ���
	public static boolean numCheck( int[] lotto, int n ) { 
		for(int i : lotto) {
			if(i == n) {
				return true;
			}
		}
		return false ;
	}

}
