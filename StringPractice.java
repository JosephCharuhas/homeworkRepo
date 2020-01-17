//Joseph Charuhas 
//StringPractice
//Date: 11/18/19

public class StringPractice
{
   public boolean endsWithStar(String s)
   {
      if(s.length() > 0 && s.charAt(s.length() - 1) == '*')//checks if last character is a star
         return true;
      else
         return false;
   }

   public boolean endsWith2Stars(String s)
   {
      if(s.length() >= 2 && s.charAt(s.length() - 1) == '*' && s.charAt(s.length() - 2) == '*')//checks if the last two characters are stars
         return true;
      else
         return false;
   }
   
   public String removeDashes(String s)
   {
      String str = s.replace("-",""); //replace dashes with empty string
      return (str);
      
   }
   
   public String modifyDate(String dateStr)
   {
      int pos1 = dateStr.indexOf('/');
      int pos2 = dateStr.indexOf('/', pos1 + 1);
      String day, month, year;
      
      if (pos1 == 1) //checks to see if month is one digit
      {
         if (pos2 == 3) //checks to see if day is one digit
         {
           month = "0" + dateStr.substring(0, 1);
           day = "0" + dateStr.substring(2, 3);
           year = dateStr.substring(4);
         }
         else //day is two digits month is one digit
         {
            month = "0" + dateStr.substring(0, 1);
            day = dateStr.substring(2, 4);
            year = dateStr.substring(5);

         }
      }
      else //month is two digits
      {
       if (pos2 == 4) //checks to see if day is one digit
         {
           month = dateStr.substring(0, 2);
           day = "0" + dateStr.substring(3, 4);
           year = dateStr.substring(5);
         }
         else //day is two digits month is two digits       
         {
            month = dateStr.substring(0, 2);
            day = dateStr.substring(3, 5);
            year = dateStr.substring(6);
         }         
      }
      
      return (day + "-" + month + "-" + year);   
   }
   
   
   public String lastFive(String ccNumber)
   {
      String str = ccNumber.replace(" ","");//gets rid of spaces
      str = str.replace("-","");  //gets rid of - s
      if (str.length() < 5)
      {
         return str;
      }
      else 
      {
         return (str.substring(str.length() - 5));
      }
   }
   
   public String scroll(String s)
   {
      return (s.substring(1) + s.substring(0, 1)); //takes first letter and appends it to the end
   }
   
   public String convertName(String s)
   {
      int pos1 = s.lastIndexOf(','); //find location of comma to find the first and last name
      String lastName = s.substring(0, pos1);
      String firstName = s.substring(pos1 + 2);
      return (firstName + " " + lastName); 
   
   }
   
   public String cutOut(String s, String remove)
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
   
   public boolean startsWith(String s, String sub)
   {
      if(sub.equals(""))
      {
         return false;
      }
      
      int pos1 = s.indexOf(sub); //finds where sub starts
      if (pos1 == 0)
      {   
         return true;
      }
      else
      {
         return false;
      }   
   }
   
   public boolean endsWith(String s, String sub)
   {
      int pos2 = s.lastIndexOf(sub);
      if (pos2 + sub.length() == s.length()) //finds if sub is at the ending
      {   
         return true;
      }
      else
      {
         return false;
      } 
   }
   
   public boolean onlyDigits(String s)
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
   
   public boolean numCompareTo(String s1, String s2)
   {
      int ct;
      int s;
      ct = s1.compareTo(s2); //uses the string compare method
      s = Integer.parseInt(s1) - Integer.parseInt(s2); //uses the mathematical method
      if (s > 0 && ct > 0) //checks to see if they have the same sign
      {
         return true;
      }
      else if (s == 0 && ct == 0)
      {
         return true;
      }
      else if (s < 0 && ct < 0)
      {
         return true;
      }
      else 
      {
         return false;
      }
   }
   
   public String negativeString(String whateverYouWant)
   {
      String s2 = whateverYouWant.replace('0', 'a');
      String s3 = s2.replace('1', '0');
      String s4 = s3.replace('a', '1');
      return (s4);
   }
     
   public int findIndexOf (char ch, int fromPos, String word)
   {
      for(int location = fromPos; location < word.length(); location++)
      {
         if(word.charAt(location) == ch)
            return location;
      }
      return -1;
   }
      
   public static void main (String Args[]) //used for checking while coding
   {
      StringPractice d = new StringPractice (); 
      
      //boolean ending = d.endsWith2Stars ("**");   //uncomment for test
      //System.out.println(ending);  //uncomment for test
      
      //String digits = d.removeDashes("703-17-6301"); 
     // System.out.println(digits);  
  
        /*
        String dates =  d.modifyDate("1/9/2019");
        System.out.println(dates);   
        dates =  d.modifyDate("11/1/2019");
        System.out.println(dates);
        dates =  d.modifyDate("12/31/2019");
        System.out.println(dates);
        dates =  d.modifyDate("3/15/2019");
        System.out.println(dates);
        dates =  d.modifyDate("01/31/2019");
        System.out.println(dates);
        */
        
        //String Number = d.lastFive("1234 5678 9101 2345");
        //System.out.println(Number);
        
        //String Word = d.scroll("scroll");
        //System.out.println(Word);
        
        //String Name = d.convertName("Charuhas, Joseph");
        //System.out.println(Name);
        
        //String sentence = d.cutOut("Hi-ho, hi-ho", "hi");
        //System.out.println(sentence);
   
        //boolean starting = d.startsWith("Hello", "");
        //System.out.println(starting);
        //boolean ending = d.endsWith("Internet", "net");
        //System.out.println(ending); 
        
        //boolean Number = d.onlyDigits("");
       // System.out.println(Number);
  
        //boolean Number = d.numCompareTo("53640", "53540");
       //System.out.println(Number);
      
        //String neg =  d.negativeString("10 01 00 11 10010");
       // System.out.println(neg);
        
        int pos =  d.findIndexOf('e', 2, "Joseph");
        System.out.println(pos);

   }

}