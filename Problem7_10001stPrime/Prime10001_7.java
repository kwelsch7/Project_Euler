public class Prime10001_7
{
   /* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
      we can see that the 6th prime is 13.
      What is the 10 001st prime number? */
   public static void main(String[] args)
   {
      long prime = 3;
      int primeCount = 2;
      for(int x = 5; primeCount < 10001; x+=2)
      {
         if(isPrime(x))
         {
            prime = x;
            primeCount++;
         }
      }
      System.out.println(prime);
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