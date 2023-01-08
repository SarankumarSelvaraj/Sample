class SumOfDigit {
  public static void main(String[] args) {
    int number, digit, sum = 0;
    number = 65758687;
    while(number > 0) {
      // get the digit value.
      digit = number % 10; //6 5 7 5,.......
      // get the sum value.
      sum += digit; 
      // get the number value.
      number = number / 10;
    }
    System.out.println("The sum of the digit is " + sum);
  }
}