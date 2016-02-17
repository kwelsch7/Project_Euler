public class LargestPalindrome_4
{
   /* A palindromic number reads the same both ways. The largest palindrome made from
      the product of two 2-digit numbers is 9009 = 91 x 99.
      Find the largest palindrome made from the product of two 3-digit numbers. */
   public static void main(String[] args)
   {
      String checker = "", firstHalf = "", lastHalf = "", finalAnswer = "";
      int middle = 0;
      for(int x = 999; x > 99; x--)
      {
         for(int y = 999; y > 99; y--)
         {
            checker = Integer.toString(x*y);
            if(checker.length() %2 == 0)
            {
               firstHalf = checker.substring(0, checker.length() / 2);
               lastHalf = checker.substring(checker.length() / 2);
            }
            else
            {
               middle = checker.length() / 2;
               firstHalf = checker.substring(0, middle);
               lastHalf = checker.substring(middle +1);
            }
            if(firstHalf.equals(flipper(lastHalf)) && checker.compareTo(finalAnswer) > 0 && checker.length() >= finalAnswer.length())
               finalAnswer = checker;
         }
      }
      System.out.println(finalAnswer);
   }
   public static String flipper(String lastHalf)
   {
      String flipped = "";
      for(int x = lastHalf.length() -1; x >= 0; x--)
         flipped += lastHalf.charAt(x);
      return flipped;
   }
}