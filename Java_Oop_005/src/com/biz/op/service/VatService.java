package com.biz.op.service;

/*
 *  extends : ������ �̹� ������� �ִ� Ŭ������ ��ӹ޾Ƽ� ����ϰڴ�.
 *  
 *  VatService�� AddService�� ����ϰڴ�.
 *    => vatService�� addService�� ���ǵ� method �߿���
 * 		   public���� ����� �͵��� ��� �̾�޾Ƽ� ����ϰڴٴ� ��
 */
public class VatService extends AddService {

	// �Ǹűݾװ� ���Աݾ��� �Ǽ�(float)�� ���޹޾Ƽ�
	// vat�� ���ܵ� ���ͱ��� return�ϴ� method ����
	public int ���ͱ�(float �Ǹűݾ�, float ���Աݾ�) {
		int �Ǹ� = (int)(�Ǹűݾ� / 1.1f) ;
		int ���� = (int)(���Աݾ� / 1.1f );
		
		return (int)(�Ǹ� - ����) ;
		
	}
	
	
	
}
