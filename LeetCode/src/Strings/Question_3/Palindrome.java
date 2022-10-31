package Strings.Question_3;

public class Palindrome {

    public static String newStr ;

    public static boolean isPalindrome(String str) {
        String reversedStr = new String();
        str = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();


        for(int i = str.length() - 1 ; i >= 0 ; i--){
            reversedStr += Character.toString(str.charAt(i));
        }

        if(str.equals(reversedStr))
            return true;

        return false;
    }

    public static Boolean isPalindromeII(String str) {
        String newStr ;
        if (isPalindrome(str))
            return true;
        else {
            for (int i = 0; i < str.length(); i++) {
                newStr = str.replace(String.valueOf(str.charAt(i)), "");
                if (isPalindrome(newStr))
                    return true;
            }
        }

        return false ;
 }
    // This one is recursive :
    public static Boolean isPalindromeIII(String str) {

        int left = 0 ;
        int right = str.length() - 1 ;

        while(left <= right){
            if(str.charAt(left) != str.charAt(right)){
                return isValid(str, left+1, right) || isValid(str, left , right-1);
            }

            left++ ;
            right--;
        }
        return true ;
    }

    public static Boolean isValid(String str, int i , int j ) {

        int left = i ;
        int right = j;

        while(left <= right){

            if(str.charAt(left) != str.charAt(right)){
                return false ;
            }

            left++ ;
            right--;
        }

        return true ;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeII("racecar"));
        System.out.println(isPalindromeIII("abca"));
    }
}
