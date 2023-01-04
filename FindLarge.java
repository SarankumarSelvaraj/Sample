class FindLarge {
  public static void main(String[] args) {
    int[] arr1 = {35, 78, 34, 789, 44, 88};
    int max = arr1[0];
    for(int i = 0; i < arr1.length; i++) {
      // check the array of i is greater than max then go and print the final largest number in the arr1.
      if(arr1[i] > max) { 
        max = arr1[i]; 
      }
    }
    System.out.println("The largest number is " + max);
  }
}