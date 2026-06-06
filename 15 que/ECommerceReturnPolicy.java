import java.util.*;
public class ECommerceReturnPolicy{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int days=sc.nextInt(); boolean defective=sc.nextBoolean(); boolean premium=sc.nextBoolean();
  if(defective||(premium&&days<=15)||(!premium&&days<=7)) System.out.println("Return Accepted");
  else System.out.println("Return Rejected");
 }
}