import java.util.*;
public class LoginAttemptLock{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int c=0;
  while(c<3){
   String p=sc.next();
   if(p.equals("admin")){System.out.println("Login Successful");return;}
   c++;
  }
  System.out.println("Account Locked");
 }
}