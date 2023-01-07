class PrimeNum {
  public static void main(String[] args) {
    // write the logic to print the prime numbers.
    // initialize the i =2 because the primenumber start from 2 and use for loop.
    for(int i = 2; i <= 100; i++) {
      // set the isPrime is true by default.
      boolean isPrime = true;
      // use for loop again to check if it is prime number or not.
      for(int j = 2; j < i; j++) {
        if(i % j == 0) {
          isPrime = false;
        }
      }
      // write if condition outside the j for loop to prime number.
      if(isPrime) {
         System.out.print(i + " ");
      }
    }
  }
}