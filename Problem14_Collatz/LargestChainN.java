public class LargestChainN
{
   private long nVal;
   private int countAtVal;
   
   public LargestChainN(final long nVal, final int countAtVal)
   {
      this.nVal = nVal;
      this.countAtVal = countAtVal;
   }
   public long getN()
   {
      return this.nVal;
   }
   public int getCount()
   {
      return this.countAtVal;
   }
   public void setN(final long n)
   {
      this.nVal = n;
   }
   public void setCount(final int count)
   {
      this.countAtVal = count;
   }
   public String toString()
   {
      return "Starting n: " + nVal + "\r\nChain length: " + countAtVal;
   }
   public static int collatz(long n, int termCount)
   {
      while(n != 1)
      {
         if(n % 2 == 0)
            n /= 2;
         else
            n = 3 * n + 1;
         termCount++;
      }
      return termCount;
   }
}