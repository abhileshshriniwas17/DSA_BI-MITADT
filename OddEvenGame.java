import java.util.*;
public class OddEvenGame{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int odd=0,even=0,n;
  while((n=sc.nextInt())!=0){
   if(n%2==0) even++; else odd++;
  }
  System.out.println("Even = "+even);
  System.out.println("Odd = "+odd);
 }
}