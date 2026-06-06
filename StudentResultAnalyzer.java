import java.util.*;
public class StudentResultAnalyzer{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int total=0; boolean fail=false;
  for(int i=0;i<5;i++){int m=sc.nextInt(); if(m<33) fail=true; total+=m;}
  if(fail){System.out.println("Fail"); return;}
  double avg=total/5.0;
  if(avg>=75) System.out.println("Distinction");
  else if(avg>=60) System.out.println("First Class");
  else if(avg>=50) System.out.println("Second Class");
  else System.out.println("Pass");
 }
}