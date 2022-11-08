package com.learn.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalDate date=LocalDate.now();
LocalDate yesterday=date.minusDays(1);
LocalDate tmr=date.plusDays(1);

LocalDateTime time=LocalDateTime.now();

System.out.println(time);
System.out.println(date);
System.out.println(yesterday);
System.out.println(tmr);
	}

}
