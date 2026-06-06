import java.util.*;
public class PasswordStrengthChecker{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String p=sc.nextLine();
  boolean d=false,u=false,s=false;
  for(char ch:p.toCharArray()){
   if(Character.isDigit(ch)) d=true;
   else if(Character.isUpperCase(ch)) u=true;
   else if(!Character.isLetterOrDigit(ch)) s=true;
  }
  System.out.println((p.length()>=8&&d&&u&&s)?"Strong Password":"Weak Password");
 }
}