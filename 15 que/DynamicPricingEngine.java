import java.util.*;
public class DynamicPricingEngine{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  double p=sc.nextDouble(); boolean demand=sc.nextBoolean(); boolean weekend=sc.nextBoolean();
  if(demand) p+=p*0.20;
  if(weekend) p+=p*0.10;
  System.out.println("Final Price = "+p);
 }
}