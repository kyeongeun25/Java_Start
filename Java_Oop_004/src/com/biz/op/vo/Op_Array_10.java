package com.biz.op.vo;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList�� ���� 10���� ��Ƽ�
 * ����
 */
public class Op_Array_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		// ������ ���� ArrayList�� 10�� �߰� 
		for(int i = 0 ; i < 10 ; i++) {
			nums.add((int)(Math.random()*100));
		}
		// �߰��� ArrayList�� Ȯ��
		System.out.println("���� ����=========================");
		for(int i : nums) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// ArrayList�� ����
		// ���� �����Ϸ��� �տ��� ����� ��øfor�� �̿��ؾ� �ϴµ�
		// Collections��� JDK Ŭ������ ������ �޾Ƽ� 
		// ���� ������ ����
		
		// Ascending asc = new Ascending();
		Collections.sort(nums); // ���������� (�⺻)
		
		
		System.out.println(nums);
		
		// Collection�� Java�� �ִ� �迭 Ŭ������(ArrayList, List, HashMap, Map)�� ���ϰ� 
		// Collections�� Collection���� �����ϱ� ���� �����ִ� Ŭ����
		// Collections.sort() �޼���� ArrayList<Integer>�� 
		// ������ �ٸ� �ڵ� ���� ���� �������ش�.
		// sort() �޼���� ArrayList�ܿ� �ٸ� Ȯ��� JDK�� �����ؾ� �ϴµ� �ڿ� ����ϰڴ�.
		// Collections.sort(ArrayList,ASC �Ǵ� DSC�� ���õ� Ȯ�� JDK)
		
	}

}
