import java.util.*;
public class PWVerifierMain
{
   public static void main(String[] args)
   {
      String password;
      PWVerifier pw = new PWVerifier();
      Scanner keyboard = new Scanner(System.in);
      System.out.println("What is the password?");
      password = keyboard.nextLine();
      if(pw.isValid(password) == true)
         System.out.println("The password is valid.");
      else
         System.out.println("The password is invalid.");
      
      System.exit(0);
   }
}