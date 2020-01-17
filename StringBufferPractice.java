//Joseph Charuhas
//12/5/19

public class StringBufferPractice 
{   
   public static void main (String[] args)
   {
      StringBuffer word = new StringBuffer();
      word = word.append("hello ");
      System.out.println(word.append("ho ho"));
      System.out.println(word.replace(1, 4, ""));
      System.out.println(word.charAt(0));
      System.out.println(word.replace(word.charAt(0), word.charAt(0) + 1, ""));
   }
}