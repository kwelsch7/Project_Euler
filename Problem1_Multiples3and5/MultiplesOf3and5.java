public class MultiplesOf3and5
{
   /* Multiples of 3 and 5 - Problem 1
      If we list all the natural numbers below 10 that are multiples
      of 3 or 5, we get 3, 5, 6 and 9.  The sum of these multiples is 23.
      
      Find the sum of the multiples of 3 or 5 below 1000. */
   public static void main(String[] args)
   {
      int sum = 0, threes = 3, fives = 5, fifteens = 15;
      for( ; threes < 1000; threes += 3)
         sum += threes;
      for( ; fives < 1000; fives += 5)
         sum += fives;
      for( ; fifteens < 1000; fifteens += 15)
         sum -= fifteens;
      System.out.println(sum);
   }
}