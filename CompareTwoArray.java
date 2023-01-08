// In this step we compare the two arrays without using inbuilt function.
class CompareTwoArray {
  public static void main(String[] args) {
    int x[] = {1, 3, 4};
    int y[] = {1, 3, 5};
    if(arrayEqualFunction(x, y)) {
      System.out.println("Both the array are equal");
    }
    else {
      System.out.println("Both the array are not equal");
    }
  }
  public static boolean arrayEqualFunction(int[] x, int[] y) {
    if(x.length != y.length) {
      return false;
    }
    else {
      for(int i = 0; i < x.length; i++) {
        if(x[i] != y[i]) {
          return false;
        }
      }
      return true;
    }
  }
}