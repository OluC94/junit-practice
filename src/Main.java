public class Main {
    public static void main(String[] args) {
    }

    /**
     * Returns true if the given inputString is a palindrome.
     * @param inputString to check for palindrome
     * @return boolean - true if given string is palindrome
     */
    public static Boolean isPalindrome(String inputString) {
        String[] charsArray = inputString.split("");
        int rearIndex = charsArray.length;

        for (String leftChar : charsArray) {
            String rightChar = charsArray[rearIndex - 1];

            if (!leftChar.equals(rightChar)) {
                return false;
            }

            rearIndex--;
        }
        return true;
    }
}