//Joseph Charuhas
//Assignment Palindrome
//Date: 11/24/19

public class Palindrome
{
   public boolean isPalindrome(String word)
   {
      // Validations
      if(word.equals(""))
         return false;
      
      // Purification
      String pureString = "";
      char a;
      for(int purificationCounter = 0; purificationCounter < word.length(); purificationCounter++)
      {
         a = word.charAt(purificationCounter);
         if(Character.isLetterOrDigit(a))
            pureString += a;        
      }
      
      // Create Backward string
      String newString = "";
      char tempChar;
      
      for(int x = pureString.length() - 1; x >= 0; x--)
      {
         tempChar = pureString.charAt(x);
         newString += tempChar;
      }
      
      // Compare
      if(pureString.equalsIgnoreCase(newString))
         return true;
      else 
         return false;
      
   }
}