import java.util.Arrays;
class RemoveDup {
  public static void main(String[] args) {
     // If you declare the data type must wrapper because we pass the object in the remove.. function.
    Integer num[] = {2, 7, 5, 1, 2, 2, 4, 5, 7, 3, 1, 12, 8, 8, 9};
    // print the original elements here.
    System.out.println("The original elements of the array");
    for(int i = 0; i < num.length; i++) {
    System.out.print(num[i] + " ");
    }
    // call the function here.
    removeDuplicateElementsArray(num);
  }
    // write the function for removeDuplicate elements in the array for overall.
    private static void removeDuplicateElementsArray(Object[] object) {
      // logic start from here.
      Arrays.sort(object);
      int length = object.length;
      // create the temp variable to store the elements from the previous array which has duplicate elements.
      Object[] temp = new Object[length];
      int j = 0;
      System.out.println();
      System.out.print("After remove the duplicate elements from the array and that is sorted: \n");
      // In this step check if it is not same element
      for(int i = 0; i < object.length - 1; i++) {
        if(object[i] != object[i+1]) {
          temp[j++] = object[i];
        }
      }
      //print the last element of the array.
      temp[j++] = object[length - 1];
      for(int i = 0; i < j; i++) {
        System.out.print(temp[i] + " ");
    }
  }
}

 