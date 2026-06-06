import java.util.*;
public class TrainTicketBooking{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int seats=sc.nextInt(); boolean vip=sc.nextBoolean();
  System.out.println((seats>0||vip)?"Ticket Confirmed":"Waitlisted");
 }
}