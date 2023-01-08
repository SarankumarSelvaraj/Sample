import java.util.*;

class RemoveDupByHash {
  public static void main(String[] args) {
    int[] arr = {2, 5, 7, 1, 2, 2, 2, 5, 5 , 7, 1, 6, 5, 2, 4, 6, 1, 1, 4, 4, 3, 4, 3, 4, 8, 8};
    //Remove the duplicate elements from array using hashmap. create the hashmap.
    HashMap<Integer, Integer> map = new HashMap<>();
     for(int i = 0; i < arr.length - 1; i++) {
       if(map.containsKey(arr[i])) {
         map.remove(arr[i]);
       }
       map.put(arr[i] , i);
     }
    map.forEach((key, value) -> System.out.print(key + " "));
  }
}