package com.capgemini.day9;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

//import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
//		1. Zone specific dates.. tokyo
		
		ZoneId zone = ZoneId.of("Asia/Tokyo");
		ZonedDateTime tokyo = ZonedDateTime.now(zone);
		System.out.println(tokyo);
		
//		2. Local date time
		
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
		System.out.println(today.format(format));
		
		
		LocalDateTime before42days = today.minus(42, ChronoUnit.DAYS);
		System.out.println(before42days);
		
		
//		LocalDateTime timePoint = LocalDateTime.now();
//		LocalDateTime thePast = timePoint.withYear(2010);
//		System.out.println(thePast);
//		LocalDateTime firstDayOfMonth = timePoint.with(TemporalAdjusters.firstDayOfMonth());
//		System.out.println("***" + firstDayOfMonth);
//		LocalDateTime yetAnother = thePast.plusWeeks(3).minus(1, ChronoUnit.DAYS);
//		System.out.println(yetAnother);
		
		
//		3. Instant -- machine time
		System.out.println(Instant.now());

	}

}
