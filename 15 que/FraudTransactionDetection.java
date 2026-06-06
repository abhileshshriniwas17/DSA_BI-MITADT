import java.util.*;
public class FraudTransactionDetection{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int amount=sc.nextInt(); boolean loc=sc.nextBoolean(); int tx=sc.nextInt();
  System.out.println((amount>50000&&!loc)||tx>3?"Fraud Detected":"Safe Transaction");
 }
}