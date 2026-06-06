import java.util.*;
public class ATMWithdrawalLogic{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int bal=sc.nextInt(), wd=sc.nextInt();
  if(bal<wd) System.out.println("Transaction Failed: Insufficient Balance");
  else if(bal-wd<1000) System.out.println("Transaction Failed: Minimum balance violation");
  else System.out.println("Transaction Successful");
 }
}