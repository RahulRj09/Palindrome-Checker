package palindrome;

public class PalindromeChecker {
    public static Boolean isPalindrome(String palindrome){
        if(isSingular(palindrome)) {
            return true;
        }
        else if(isFirstLastIndexSame(palindrome)){
            return isPalindrome(getSubString(palindrome));
        }
        return false;
    }

    static boolean isSingular(String palindrome){
       return palindrome.isEmpty() || palindrome.length()== 1;
    }

    static String getSubString(String palindrome){
      return  palindrome.substring(1,palindrome.length()-1);
    }

    static boolean isFirstLastIndexSame(String palindrome){
        return palindrome.charAt(0) == palindrome.charAt(palindrome.length()-1);
    }
    public static void main(String[] args){
        String palindrome = args[0];
        System.out.println(isPalindrome(palindrome));
    }
}
