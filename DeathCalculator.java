package dateandtimeapi;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DeathCalculator {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Birthday Date dd-mm-yyy Formate : - ");
		String input = sc.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate date = LocalDate.parse(input, formatter);
		
		
		LocalDate localDate = LocalDate.now();
		LocalDate deathDay = date.plusYears(60);
		
		Period p = Period.between(localDate, deathDay);
		
		int y = p.getYears();
		int m = p.getMonths();
		int d = p.getDays();
		
		System.out.printf("\nYou Will be On Earth Only %d Years %d Months %d Days Only, Hurry Up to do More Important things", y, m, d );
		

	}

}

