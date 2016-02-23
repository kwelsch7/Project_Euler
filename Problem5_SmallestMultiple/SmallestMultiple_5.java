public class SmallestMultiple_5
{
   /* 2520 is the smallest number that can be divided by each of the numbers
      from 1 to 10 without any remainder.
      What is the smallest positive number that is evenly divisible
      by all of the numbers from 1 to 20? */
   public static void main(String[] args)
   {
      int[] numbers = new int[20];
      for(int x = 0; x < 20; x++)
      {
         numbers[x] = x + 1;
         if(isPrime(numbers[x]) && numbers[x] != 1)
         {
            while(numbers[x]*numbers[x] < 20)
               numbers[x] *= numbers[x];
         }
         else
            numbers[x] = 1;
      }
      int answer = 1;
      for(int i: numbers)
         answer *= i;
      System.out.println(answer);
   }
   public static boolean isPrime(int testee)
   {
      for(int x = 2; x < testee; x++)
      {
         if(testee %x == 0)
            return false;
      }
      return true;
   }
}