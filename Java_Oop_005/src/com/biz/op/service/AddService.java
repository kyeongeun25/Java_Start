package com.biz.op.service;
/*
 * Ŭ���� �̸� ���� ���̴� ���̻翡 ����
 * Ŭ������ ������θ��� �����Ѵ�.
 * *VO : ����� ���� �� ������ Ÿ��, Value Object
 * 		  �پ��� ������ member������ ���� ���·� ���� Ŭ����
 * 		  DTO(Data Transfer Object), DO(Data Object)
 * 		  member ����(����)�� �ְ�, member ������ ���������� �Ǿ� �ְ�,
 * 		  getter�� setter�� ����
 * 
 * *Service : ������ ���� ���� �����ϴ� Ŭ����
 * 				DAO(Data Access Object), Controller
 * 				method(����)��� �̷���� �ִ�.
 */
public class AddService {
		
	// ���� 2���� �޾Ƽ� �����ϰ� 
	// ����� return�ϴ� method�� ����
		public int sum (int num1, int num2) {
			return num1 + num2 ;
		}
	
	
	// Service Ŭ������ method�� public���� ����
	// �ܺο��� method�� �����ؼ� � ������ �����ϱ� ����
		

	
	// �Ǹűݾװ� ���Աݾ��� �޾Ƽ� 
	// ���ͱ��� ����ؼ� return�ϴ� method ����
		public int ���ͱ�(int �Ǹűݾ�, int ���Աݾ�) {
			return �Ǹűݾ� - ���Աݾ�;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
