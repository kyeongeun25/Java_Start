package com.biz.app;

import java.util.ArrayList;
import java.util.Collections;
/*
 *  ���������� �����ϱ� ���� ��ȭ��ȣ�� �߰��ؼ�
 *  ��ȭ��ȣ���� ���� ǥ�� �� ����
 */
public class App_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<MemberVO> members = new ArrayList<MemberVO>();

		// ȸ���̸��� �߰�
		members.add(new MemberVO("ȫ�浿", "111"));
		members.add(new MemberVO("�̸���", "112"));
		members.add(new MemberVO("������","113"));
		members.add(new MemberVO("�庸��","114"));
		members.add(new MemberVO("�念��","115"));
		members.add(new MemberVO("�Ӳ���","116"));
		members.add(new MemberVO("������","117"));
		members.add(new MemberVO("�庸��","118"));
		members.add(new MemberVO("�念��","119"));
		members.add(new MemberVO("�Ӳ���","120"));
		members.add(new MemberVO("������","121"));
		
		MemberVO vo = new MemberVO("�庸��","122");
		members.add(vo);
		vo = new MemberVO("�念��","123");
		members.add(vo);
		vo = new MemberVO("�Ӳ���","124");
		members.add(vo);
		
		Collections.shuffle(members);
		for(int i = 0 ; i < 3 ; i ++) {
			System.out.println((i+1)+"��° ��÷�� : "+members.get(i) );
															// = members.get(i).toString()
															// memgers.get(i)�� members�� ���Ե�
															// � VO�� ����ȴ�.
															// ��ü�� println()���� �ֿܼ� ����ϵ��� �ϸ�
															// �ڵ����� ��ü.toString() �޼��带 ȣ���Ѵ�.
			
		}
	}

}
