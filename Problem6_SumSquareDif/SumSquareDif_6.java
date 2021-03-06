public class SumSquareDif_6
{
   /* The sum of the squares of the first ten natural numbers is
      1^2 + 2^2 + ... + 10^2 = 385
      The square of the sum of the first ten natural numbers is
      (1 + 2 + ... + 10)^2 = 55^2 = 3025
      Hence the difference between the sum of the squares of the
      first ten natural numbers and the square of the sum is
      3025 - 385 = 2640.
      
      Find the difference between the sum of the squares of the
      first one hundred natural numbers and the square of the sum.
   */
   public static void main(String[] args)
   {
      long sumOfSquares = 0;
      long squareOfSums = 0;
      for(int x = 1; x < 101; x++)
      {
         sumOfSquares += x * x;
         squareOfSums += x;
      }
      long difference = squareOfSums * squareOfSums - sumOfSquares;
      System.out.println(difference);
   }
}