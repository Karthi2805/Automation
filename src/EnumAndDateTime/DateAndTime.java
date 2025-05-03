package EnumAndDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class DateAndTime {
	
	public static void localdate () {   //Staic method - without an object directly going to call method by name
		LocalDate date = LocalDate.now();
		System.out.println(date);
		System.out.println("Current date of month is : " + date.getDayOfMonth());
		System.out.println("Current day of year is : " + date.getDayOfYear());
		System.out.println("Current day of week is : " + date.getDayOfWeek());
		
		System.out.println("Current month value is : " + date.getMonthValue());
		System.out.println("Length of the year is : " + date.lengthOfYear());
		System.out.println("Length of the month is : " + date.lengthOfMonth());
		
		System.out.println("Yesterday date is : " + date.minusDays(1));
		System.out.println("Tommorow date is : " + date.plusDays(1));
		System.out.println("*********************************************************************");
		
		LocalDate date1 = LocalDate.of(1997, 5, 28);
		System.out.println(date1);
		System.out.println("Current date of month is : " + date1.getDayOfMonth());
		System.out.println("Current day of year is : " + date1.getDayOfYear());
		System.out.println("Current day of week is : " + date1.getDayOfWeek());
		
		System.out.println("Current month value is : " + date1.getMonthValue());
		System.out.println("Length of the year is : " + date1.lengthOfYear());
		System.out.println("Length of the month is : " + date1.lengthOfMonth());
		
		System.out.println("Yesterday date is : " + date1.minusDays(1));
		System.out.println("Tommorow date is : " + date1.plusDays(1));
		System.out.println("*********************************************************************");
		
		String[] zoneIDs = TimeZone.getAvailableIDs();
		for (String zoneID : zoneIDs) {
			System.out.println(zoneID);
		}
		
		System.out.println("****************************************************************");
		
		LocalDate date2 = LocalDate.now(ZoneId.of("Canada/Eastern"));
		
		System.out.println(date2);
		System.out.println("Current date of month is : " + date2.getDayOfMonth());
		System.out.println("Current day of year is : " + date2.getDayOfYear());
		System.out.println("Current day of week is : " + date2.getDayOfWeek());
		
		System.out.println("****************************************************************");
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		
		LocalTime time2 = LocalTime.now(ZoneId.of("Canada/Eastern"));
		System.out.println(time2);
		
	}
	
	public static void localDateTime () {
		LocalDateTime datetime1 = LocalDateTime.now();
		System.out.println(datetime1);
		
		LocalDateTime datetime2 = LocalDateTime.now(ZoneId.of("Canada/Eastern"));
		System.out.println(datetime2);
		
		DateTimeFormatter formatting = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss");
		System.out.println(datetime1.format(formatting));
		
		System.out.println(datetime2.format(formatting));
	}

	public static void main(String[] args) {
		//localdate();
		localDateTime();

	}

}
