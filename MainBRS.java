package BusReservationSystem;

import java.util.*;
import java.util.Scanner;

public class MainBRS {
	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		buses.add(new Bus(1,true,12));
		buses.add(new Bus(2,false,14));
		buses.add(new Bus(3,true,13));
		buses.add(new Bus(4,false,15));
		
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		int userOpt = 1;
		Scanner scn=new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusInfo();
		}
		
		while(userOpt == 1) {
			System.out.println("Enter 1 To Book\nEnter 2 To Exit");
			userOpt = scn.nextInt();
			if(userOpt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your Booking is Confirmed");
				}
				else {
					System.out.println("The Bus is Full,Try Another Bus or Date");
				}
			}
		}
	}
}
