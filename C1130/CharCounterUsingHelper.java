class CharCounterUsingHelper {
  // int depth = 0;
  public static void main(String[] args) {
    CharCounterUsingHelper counter = new CharCounterUsingHelper();
    char target = 'e';
    // int count = counter.countChar("exercise 1", target);
    String s = "Complete exercise 18.10 in the textbook, " + 
        "that is, to count occurrences of a specified character in a " + 
        "string.";
    int count = counter.countChar3(s, target);
    System.out.printf("length(s) = %d\n", s.length());
    System.out.printf("Found %c %d times in the string\n", target, count);
  }
  
  /* Critique:
     substring(...): because String is immutable in Java
     when you are getting a substring, you actulaly another string object
  */
  
  /* Another way:
     Divide it into two tasks nearly equal size
      1. count the target character in the 1st half
      2. count the target character in the 2nd half
  */
  int countChar3(String s, char target) {
      // call recursive funfction
      int beginIndex = 0;
      int endIndex = s.length() - 1;
      return countCharHelper(s, beginIndex, endIndex, target);
  }
  
  int countCharHelper(String s, int beginIndex, int endIndex, char target) {
    // count from beginIndex to endIndex */
    //            beginIndex ... middle point between beginIndex and endIndex ... endIndex
    int count;
    
    if (endIndex < beginIndex) return 0; // base case 1.
    if (endIndex - beginIndex == 0 && s.charAt(beginIndex) == target) return 1; // base case 2
    if (endIndex - beginIndex == 0 && s.charAt(beginIndex) != target) return 0; // base case 3
    
    // length 2
    int midIndex = beginIndex + (endIndex - beginIndex)/2;
    /*
    System.out.printf("beginIndex = %d, midIndx = %d, ennIndex = %d\n", beginIndex, midIndex, endIndex);
    depth ++;
    */
    if (depth > 10) System.exit(1);
    count = countCharHelper(s, beginIndex, midIndex, target) +
            countCharHelper(s, midIndex+1, endIndex, target);  
    return count;
  }
  
  int countChar2(String s, char target) {
    int count;
    
    
    if (s.length() == 0) return 0; // base case 1.
    if (s.length() == 1 && s.charAt(0) == target) return 1;
    if (s.length() == 1 && s.charAt(0) != target) return 0;
    
    count = countChar2(s.substring(0, s.length()/2), target) +
            countChar2(s.substring(s.length()/2, s.length()), target);  
    return count;
  }

  
}
