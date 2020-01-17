//Joseph Charuhas 
//Extra Credit
//#8

public class ReturnANegativeString
{
    public String negativeString(String whateverYouWant)
   {
      String s2 = whateverYouWant.replace('0', 'a');
      String s3 = s2.replace('1', '0');
      String s4 = s3.replace('a', '1');
      return (s4);
   }
}