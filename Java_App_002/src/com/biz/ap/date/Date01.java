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

		// JAVA에서 사용되는 날짜와 관련된 클래스들
		Date date = new Date(); // 현재시각을 추출
		Calendar ca = Calendar.getInstance(); // 현재시각을 추출
		
		System.out.println(date.getSeconds());
		System.out.println(date.getTime());
		System.out.println(ca.getTime());
		
		// Date 클래스와 Calendar 클래스는 태생이 문제 많은 클래스
		// Date 클래스는 어떤 JDK를 import 하느냐에 따라
		// 기능적인 차이가 매우 크다.
		
		// JDK 8 (1.8) 이상에서는 Date, Calendar 대신
		// LocalDate 클래스를 사용한다.
		LocalDate localDate = LocalDate.now();
		// >> 현재 시각을 추출해서 localDate 객체를 생성해준다.
		System.out.println(localDate);
		
		LocalDate first_2018 = LocalDate.of(2018, Month.JANUARY,1);
		System.out.println(first_2018);
		
		LocalDate koreaToday = LocalDate.now(ZoneId.of("Asia/Seoul")); // 서울표준시
		System.out.println("서울 : "+koreaToday);
		
		LocalDate shanghai = LocalDate.now(ZoneId.of("Asia/Shanghai")); // 상하이 표준시
		System.out.println("상하이 : "+shanghai);
		
		//시간
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		// 날짜와 시각을 동시에
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		
		
		
	}

}
