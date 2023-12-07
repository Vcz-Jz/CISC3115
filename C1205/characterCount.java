public class characterCount {
    public class CharacterCount {

        public static void main(String[] args) {
            String inputString = "hello";
            char targetChar = 'l';

            int count = countOccurrences(inputString, targetChar);

            System.out.println("The character '" + targetChar + "' occurs " + count + " times in the string.");
        }

        public static int countOccurrences(String str, char target) {
            if (str.isEmpty()) {
                return 0;
            }

            int occurrencesInRest = countOccurrences(str.substring(1), target);

            if (str.charAt(0) == target) {
                return 1 + occurrencesInRest;
            } else {
                return occurrencesInRest;
            }
        }
    }

}
