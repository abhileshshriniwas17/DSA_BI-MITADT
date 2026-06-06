import java.util.*;
public class CabFareSystem{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int d=sc.nextInt(); boolean night=sc.nextBoolean();
  double fare;
  if(d<=5) fare=d*50;
  else if(d<=10) fare=250+(d-5)*40;
  else fare=450+(d-10)*30;
  if(night) fare+=fare*0.20;
  System.out.println("Fare = "+fare);
 }
}