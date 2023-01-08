class SwapTwoVariable {
  public static void main(String[] args) {
    // swap two variable using temp variable.
    int x = 189;
    int y = 289;
    System.out.println("Before swapping the variable of x value is: " + x);
    System.out.println("Before swapping the variable of y value is: " + y);
    System.out.println();
    int temp;
    temp = x;
    x = y;
    y = temp;
    System.out.println("After swapping the variable of x value is: " + x);
    System.out.println("After swapping the variable of y value is: " + y);
    // swap two variable without using temp variable.
    System.out.println("----------------------------------------------------");
    System.out.println();
    int a = 134;
    int b = 278;
    System.out.println("Before swapping a is: " + a);
    System.out.println("Before swapping b is: " + b);
    System.out.println();
    // perform the swap operation without temp variable.
    a = a + b; // a = 134 + 278 = 412.
    b = a - b; //b = 412 - 278 = 134.
    a = a - b; //a = 412 - 134 = 278.
    System.out.println("After swapping a is: " + a);
    System.out.println("After swapping b is: " + b);
  }
}