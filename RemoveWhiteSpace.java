class RemoveWhiteSpace {
  public static void main(String[] args) {
    String lan = "Java is a OOPS related language";
    char[] chars = lan.toCharArray();
    String str="";
    // use for loop inside that if statement is used to make sure if whitespace is not exist.
    for(int i = 0; i < chars.length; i++) {
      if(chars[i] != ' ') {
        str += chars[i];
      }
    }
    System.out.println(str);
  }
}