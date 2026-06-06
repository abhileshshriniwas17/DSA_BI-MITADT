import java.util.*;
public class DiscountEligibility{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  double amount=sc.nextDouble();
  boolean premium=sc.nextBoolean();
  double d=0;
  if(amount>=5000)d=20; else if(amount>=3000)d=10;
  if(premium)d+=5;
  System.out.println("Final Amount = "+(amount-amount*d/100));
 }
}