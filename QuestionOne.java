//package hw3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class QuestionOne {

	public static void main(String[] args)
	{
		
		LocalDate birthDay = LocalDate.of(1996, Month.MARCH, 15);
		LocalTime time = LocalTime.of(19, 15);
		
		//using ZonedDate to calculate
		ZonedDateTime b = ZonedDateTime.of(birthDay, time, ZoneId.systemDefault());// use system default time zone
		ZonedDateTime z = ZonedDateTime.of(LocalDate.now(),LocalTime.now(),ZoneId.systemDefault());
		System.out.println(Duration.between(b, z).toDays() + " days.");
		
		//using localDate to calculate 
		LocalDate currentDate = LocalDate.now();
	    long diffInDays = ChronoUnit.DAYS.between(birthDay, currentDate);
	    System.out.println(diffInDays + " days.");
		
	}
}
