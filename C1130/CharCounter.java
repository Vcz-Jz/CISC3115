class CharCounter {
  public static void main(String[] args) {
    CharCounter counter = new CharCounter();
    char target = 'e';
    // int count = counter.countChar("exercise 1", target);
    int count = counter.countChar2("Complete exercise 18.10 in the textbook, " + 
        "that is, to count occurrences of a specified character in a " + 
        "string.", target);
    System.out.printf("Found %c %d times in the string\n", target, count);
  }
  
  /* Critique:
     substring(...): because String is immutable in Java
     when you are getting a substring, you actulaly another string object
  */
  
  /* third way
    Divide it into two tasks:
     1. find character using indexOf
     2. find character frmo the rest
  */
  
  
  /* Another way:
     Divide it into two tasks nearly equal size
      1. count the target character in the 1st half
      2. count the target character in the 2nd half
  */
  int countChar2(String s, char target) {
    int count;
    
    
    if (s.length() == 0) return 0; // base case 1.
    if (s.length() == 1 && s.charAt(0) == target) return 1;
    if (s.length() == 1 && s.charAt(0) != target) return 0;
    
    count = countChar2(s.substring(0, s.length()/2), target) +
            countChar2(s.substring(s.length()/2, s.length()), target);  
    return count;
  }

  
  /* One way:
     Divide it to two tasks:
       1. count the target character from a single character
       2. count the rest string (identical problem, closer to the base case)
  */
  int countChar(String s, char target) {
    if (s.length() == 0) return 0;
    
    int count = 0;
    if (s.charAt(0) == target) {
       // count as 1
       count = 1;
    }
    count = count + countChar(s.substring(1, s.length()), target);
    return count;
  }
  
}
