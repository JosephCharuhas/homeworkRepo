//Joseph Charuhas
//assignment Isbn
//date: 11/24/19

public class IsbnClass
{
   public static String removeDashes(String s)
   {
      String str = s.replace("-",""); //replace dashes with empty string
      return (str);
      
   }

   public static boolean onlyDigits(String s)
   {
      char ch;
      if (s.equals(""))
      {
         return false;
      }
      for(int pos = 0; pos < s.length(); pos++) // loop through each character in the string
      {
         ch = s.charAt(pos);
         if (!Character.isDigit(ch)) //finds if current char is a digit 
         {
            return false;
         } 
      }
      return true; //only if all char are digits
   }
   
   public static boolean isValidISBN(String isbn)
   {
      isbn = removeDashes(isbn);//removes dashes
      if (isbn.length() != 13)//testing to make sure that there are only 13 digits
         return false;
      if (!onlyDigits(isbn))//testing to make sure that there are only digits
         return false;
         
      boolean multBy3 = false;
      char d;
      int digit;
      int sum = 0;
      for(int pos = 0; pos <= 12; pos++)//goes through the char/numbers in the string 
      {
         d = isbn.charAt(pos);
         digit = Character.digit(d, 10);//converts char to numbers
         if(multBy3)//multiplies by three every other digit
         {
            digit *= 3;
            sum += digit;
            multBy3 = false;
         }
         else
         {
            sum += digit;
            multBy3 = true;
         }
      }
      
      if(sum % 10 == 0)//checks to see if it is valid
         return true;
      else
         return false;
   }
}