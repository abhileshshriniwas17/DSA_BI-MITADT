import java.util.*;
public class SmartElevatorSystem{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int current=sc.nextInt(), r1=sc.nextInt(), r2=sc.nextInt();
  System.out.println("Next Stop = "+(r1>current?r1:r2));
 }
}