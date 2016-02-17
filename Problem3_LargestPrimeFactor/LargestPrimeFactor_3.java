public class LargestPrimeFactor_3
{
   /* The prime factors of 13195 are 5, 7, 13, and 29.
      What is the largest prime factor of the number 600851475143? */
   public static void main(String[] args)
   {
      long factorable = 600851475143L;
      long testLength = (long)Math.sqrt(600851475143L);
      long largestPrimeFactor = 0;
      for(long q = 2; q < testLength; q++)
      {
         if(factorable %q ==0 && isPrime(q))
            largestPrimeFactor = q;
      }
      System.out.println(largestPrimeFactor);
   }
   public static boolean isPrime(long testee)
   {
      for(long x = 2; x < testee; x++)
      {
         if(testee %x == 0)
            return false;
      }
      return true;
   }
}