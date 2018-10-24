package com.biz.ap.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Date01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// JAVA���� ���Ǵ� ��¥�� ���õ� Ŭ������
		Date date = new Date(); // ����ð��� ����
		Calendar ca = Calendar.getInstance(); // ����ð��� ����
		
		System.out.println(date.getSeconds());
		System.out.println(date.getTime());
		System.out.println(ca.getTime());
		
		// Date Ŭ������ Calendar Ŭ������ �»��� ���� ���� Ŭ����
		// Date Ŭ������ � JDK�� import �ϴ��Ŀ� ����
		// ������� ���̰� �ſ� ũ��.
		
		// JDK 8 (1.8) �̻󿡼��� Date, Calendar ���
		// LocalDate Ŭ������ ����Ѵ�.
		LocalDate localDate = LocalDate.now();
		// >> ���� �ð��� �����ؼ� localDate ��ü�� �������ش�.
		System.out.println(localDate);
		
		LocalDate first_2018 = LocalDate.of(2018, Month.JANUARY,1);
		System.out.println(first_2018);
		
		LocalDate koreaToday = LocalDate.now(ZoneId.of("Asia/Seoul")); // ����ǥ�ؽ�
		System.out.println("���� : "+koreaToday);
		
		LocalDate shanghai = LocalDate.now(ZoneId.of("Asia/Shanghai")); // ������ ǥ�ؽ�
		System.out.println("������ : "+shanghai);
		
		//�ð�
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		// ��¥�� �ð��� ���ÿ�
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		
		
		
	}

}
