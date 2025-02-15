package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number:");
		int roomNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = simpleDateFormat.parse(sc.nextLine());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = simpleDateFormat.parse(sc.nextLine());
		
		
		Reservation reservation = new Reservation(123, checkIn, checkOut);
		System.out.println(reservation);
		
		System.out.println("Enter data to update the reservation: ");
		System.out.print("Check-in date (dd/MM/yyyy): ");
		checkIn = simpleDateFormat.parse(sc.nextLine());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		checkOut = simpleDateFormat.parse(sc.nextLine());
		reservation.updateDates(checkIn, checkOut);
		System.out.println(reservation);
	}

}
