package com.biz.app;

import com.biz.app.children.�簢��;
import com.biz.app.parents.����;
/*
 * Ŭ������ ���
 *  1.	������ �� �ۼ��� Ŭ������ ��� ����� �״�� �����޾Ƽ�
 * 		������ �ڵ� ���� ���� ����ϴ� ��
 * 
 *  2.	���� Ŭ������ ���� ����� ��� �״�� ����ϸ鼭
 * 		������ �߰� ����� ÷���Ͽ� ����ϰ� ���� ��
 * 		����� ���� �� ���� method�� �ٽ� ����(������, Override)�ϰų�
 * 		���ο� method, member���� ���� �߰��Ͽ� ����Ѵ�.
 * 
 *  3.	��� �� ����� �����Ͽ����� 
 * 		���� Ŭ������ �̿��Ͽ� ���ߵ� �ٸ� �κп��� 
 * 		� ���⵵ ��ġ�� �ʴ´�.
 */
public class ExtendsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		���� poly = new ����();
		poly.����();
		
		�簢�� rec = new �簢��();
		rec.set����(5);
		rec.set����(10);
		rec.����();
		// �簢���� ���̴� ~~�Դϴ�
		
	}

}
