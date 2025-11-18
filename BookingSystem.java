class Ride {
 private int availableSeats = 1; // only 1 seat left
 // synchronized method to prevent race condition
 public synchronized void bookRide(String user) {
 System.out.println(user + " trying to book a ride...");
 if (availableSeats > 0) {
 System.out.println(user + " successfully booked the ride!");
 availableSeats--;
 System.out.println("Remaining Seats: " + availableSeats);
 } else {
 System.out.println("Sorry " + user + ", ride already booked!");
 } }}
// BookingSystem.java
public class BookingSystem {
 public static void main(String[] args) {
 Ride ride = new Ride();
 Thread  u1 = new Thread(()->ride.bookRide("Aswin"));
 Thread  u2 = new Thread(()->ride.bookRide("Megha"));
 Thread  u3 = new Thread(()->ride.bookRide("KUMAR"));
 u1.start();
 u2.start();
 u3.start();
  }}