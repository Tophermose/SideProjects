public class PWVerifier
{
   boolean bool;
   final int PW_LENGTH = 8;
   int count = 0;
   String str;
   
   public PWVerifier()
   {
   }
   
   public boolean isValid(String str)
   {
      bool = false;
      
      if(str.length() >= PW_LENGTH && hasUpperCase(str) == true && hasLowerCase(str) == true &&
      hasDigit(str) == true && hasSpecialCharacter(str) == true)
         bool = true;
      return bool;
   }
   
   public boolean hasUpperCase(String str)
   {
      bool = false;
      for(int i = 0; i < str.length(); i++)
      {
         char ch = str.charAt(i);
         if(Character.isUpperCase(ch))
            bool = true;
      }
      return bool;
   }
   
   public boolean hasLowerCase(String str)
   {
      bool = false;
      for(int i = 0; i < str.length(); i++)
      {
         char ch = str.charAt(i);
         if(Character.isLowerCase(ch))
            bool = true;
      }
      return bool;
   }
   
   public boolean hasDigit(String str)
   {
      bool = false;
      for(int i = 0; i < str.length(); i++)
      {
         char ch = str.charAt(i);
         if(Character.isDigit(ch))
            bool = true;
      }
      return bool;
   }
   
   public boolean hasSpecialCharacter(String str)
   {
      bool = false;
      String special = "!@#$%^&*()";
      for(int i = 0; i < str.length(); i++)
      {
         for(int j = 0; j < special.length(); j++)
         {
            if(str.charAt(i) == special.charAt(j))
            count++;
               if(str.charAt(i) == special.charAt(j) && count > 1)
               bool = true;
         }
      }
      return bool;
   }
}