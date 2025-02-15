package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Erro in reservation: Check-out date must be after check-in date");
		} else {
			Reservation reservation = new Reservation(123, checkIn, checkOut);
			System.out.println("Reservation: "+reservation);
			
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = simpleDateFormat.parse(sc.nextLine());
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = simpleDateFormat.parse(sc.nextLine());
			
			
			String error = reservation.updateDates(checkIn, checkOut);
			if(error != null) {	
				System.out.println("Error in reservation: "+error);
			} else {
				System.out.println("Reservation: "+reservation);
			}
		}
	}

}
