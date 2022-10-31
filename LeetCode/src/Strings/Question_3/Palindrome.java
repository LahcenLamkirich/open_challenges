package Strings.Question_3;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        String reversedStr = new String();

        System.out.println("The length : " + str.length());
        for(int i = str.length() - 1 ; i >= 0 ; i--){
            reversedStr += Character.toString(str.charAt(i));
        }

        if(str.equals(reversedStr))
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("aba"));
    }
}
