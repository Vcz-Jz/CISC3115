class PalindromeTester {
  public static void main(String[] args) {
    PalindromeTester tester = new PalindromeTester();
    System.out.printf("\"%s\" is palindrome? %b\n", "", tester.isPalindrome(""));
    System.out.printf("\"%s\" is palindrome? %b\n", "a", tester.isPalindrome("a"));
    System.out.printf("\"%s\" is palindrome? %b\n", "ab", tester.isPalindrome("ab"));
    System.out.printf("\"%s\" is palindrome? %b\n", "aa", tester.isPalindrome("aa"));
    System.out.printf("\"%s\" is palindrome? %b\n", "dad", tester.isPalindrome("dad"));
    System.out.printf("\"%s\" is palindrome? %b\n", "mum", tester.isPalindrome("mum"));
    System.out.printf("\"%s\" is palindrome? %b\n", "out", tester.isPalindrome("out"));
    System.out.printf("\"%s\" is palindrome? %b\n", "moon", tester.isPalindrome("moon"));
    System.out.printf("\"%s\" is palindrome? %b\n", "noon", tester.isPalindrome("noon"));
    System.out.printf("\"%s\" is palindrome? %b\n", "moon", tester.isPalindrome("moon"));
    System.out.printf("\"%s\" is palindrome? %b\n", "abda", tester.isPalindrome("abda"));
  }
  
  boolean isPalindrome(String s) {
    if (s.length() <= 1) {
      return true;
    } else {
      boolean decision = s.charAt(0) == s.charAt(s.length()-1) 
        && isPalindrome(s.substring(1, s.length()-1));
      return decision;
    }
    
  }
}
