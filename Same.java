//Joseph Charuhas
//Question 9

public class Same
{
   public boolean isTheSame(String word)
   {
      char c = word.charAt(0);
      for (int pos = 1; pos < word.length(); pos++)
      {
         if (c == word.charAt(pos))
         {
         }
         else
            return false;  
      }
      return true;
      
   }
   
   public static void main (String Args[]) 
   {
      Same d = new Same();
      boolean a = d.isTheSame("87787");
      System.out.println(a);
   }
}