class ReverseNumber {
  public static void main(String[] args) {
    int number = 123456789;
    int reverseNum = 0;
    int digit;
    while(number != 0) {
      digit = number % 10;
      reverseNum = reverseNum * 10 + digit;
      number = number / 10;
    }
    System.out.println("Reverse Number is: " + reverseNum + " :)");
    
  }
} 