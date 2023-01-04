class ArrayRev {
  public static void main(String[] args) {
    int[] arr2 = {21, 32, 467, 53, 6};
    System.out.println("The original array is ");
    for(int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }
    System.out.println();
    System.out.println("The reverse array is ");
    for(int i = arr2.length - 1; i >=0; i--) {
      System.out.print(arr2[i] + " ");
    }
  }
}