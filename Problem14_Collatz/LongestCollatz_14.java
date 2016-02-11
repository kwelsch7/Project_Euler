public class LongestCollatz_14
{
   /* Longest Collatz sequence - Problem 14
      The following iterative sequence is defined for the set of positive integers:
         n -> n/2 (n is even)
         n -> 3n+1 (n is odd)
      Using the rule above and starting with 13, we generate the following sequence:
         13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
      It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
      Although it has not been proved yet, it is thought that all starting numbers finish at 1.
      
      Which starting number, under one million, produces the longest chain?
      NOTE: Once the chain starts the terms are allowed to go above one million. */
   public static void main(String[] args)
   {
      int termCount = 0;
      long n = 2;
      LargestChainN current = new LargestChainN(1, 1);
      for( ; n < 1000000; n++)
      {
         termCount = 0;
         termCount = LargestChainN.collatz(n, termCount);
         if(termCount > current.getCount())
         {
            current.setN(n);
            current.setCount(termCount);
         }
      }
      System.out.println(current);
   }
}