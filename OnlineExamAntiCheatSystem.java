import java.util.*;
public class OnlineExamAntiCheatSystem{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int tab=sc.nextInt(), idle=sc.nextInt();
  System.out.println(tab>3||idle>5?"Cheating Suspected":"Normal Activity");
 }
}