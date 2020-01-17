//Joseph Charuhas
//1/9/20
//extra Credit #14

public class removeTags
{
   public static String cutOut(String s, String remove)
   {
      int pos1 = s.indexOf(remove);
      if (pos1 == -1) //checks to see if remove is not found
      {
         return (s);
      }
      int pos2 = pos1 + remove.length(); //calculates the remainder of the string after the cutout
      String left = s.substring(0, pos1);
      String right = s.substring(pos2);
      return(left + right);  
   }
 
   public String  removeTag (String s)
   {
      if(s.charAt(0) != '<')
         return s;
      
      String start = s.substring(0, s.indexOf('>') + 1);
      String end = s.substring(s.length() - start.length() - 1);
      String temp = end.replace("/", "");
      if(start.equals(temp))
      {
         String phrase = removeTags.cutOut(s, start);
         phrase = removeTags.cutOut(phrase, end);
         return phrase;
      }
      return s;
   }
   
   public static void main (String Args[]) 
   {
      removeTags d = new removeTags();
      String newPhrase = d.removeTag("<b>Strings are immutable</b>");
      System.out.println(newPhrase);
   }
}