import java.util.*;

class RemoveDupByHash {
  public static void main(String[] args) {
    int[] arr = {2, 5, 7, 1, 2, 2, 2, 5, 5 , 7, 1, 6, 5, 2, 4, 6, 1, 1, 4, 4, 3, 4, 3, 4, 8, 9, 8};
    //Remove the duplicate elements from array using hashmap. create the hashmap.
    HashMap<Integer, Integer> map = new HashMap<>();
     for(int i = 0; i < arr.length; i++) {
       if(map.containsKey(arr[i])) {
         map.remove(arr[i]);
       }
       map.put(arr[i] , i);
     }
    map.forEach((key, value) -> System.out.print(key + " "));
    // declare and initialize the string array here.
    System.out.println();
    String[] str = {"Apple", "Banana", "Apple", "Banana", "JackFruit", "Apple", "JackFruit"};
      removeDuplicateArrayUsingHash(str); 
  }
  // write the method to remove the duplicate elements and sorted the elements in order and also reuse for any data type we did like this.
  private static void removeDuplicateArrayUsingHash(Object[] object) {
    HashMap<Object, Integer> map2 = new HashMap<>();
    for(int i = 0; i < object.length; i++) {
      if(map2.containsKey(object[i])) {
        map2.remove(object[i]);
      }
      map2.put(object[i], i);
    }
    map2.forEach((key1, value1) -> System.out.print(key1 + " "));
  }
}