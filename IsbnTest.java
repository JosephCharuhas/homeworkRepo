//Joseph Charuhas
//assignment ISBN
//Date: 11/24/19

public class IsbnTest
{
   public static void main (String Args[])//tests isbn class
   {
      IsbnClass x = new IsbnClass();
      String testString = "978-0679435273";
      boolean result = x.isValidISBN(testString);
      System.out.println(testString + " " + result);
      
      testString = "978-0679432573";
      result = x.isValidISBN(testString);
      System.out.println(testString + " " + result);

      testString = "1234";
      result = x.isValidISBN(testString);
      System.out.println(testString + " " + result);

      testString = "978-0071437653";
      result = x.isValidISBN(testString);
      System.out.println(testString + " " + result);
   }
}