package December_6_2022;

public class Main {

    public static void main(String[] args) {
        // Palindrome number check
        // non-optimized
        System.out.println(isPalindrome(1));
        System.out.println(isPalindrome(12));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(1221));

        // optimized
        System.out.println(isPalindromeOptimized(1));
        System.out.println(isPalindromeOptimized(12));
        System.out.println(isPalindromeOptimized(121));
        System.out.println(isPalindromeOptimized(-121));
        System.out.println(isPalindromeOptimized(1221));
    }

    public static boolean isPalindrome(int x) {
        String sX = String.valueOf(x);
        int i = 0;
        int j = sX.length() - 1;

        while(i < j) {
            if(sX.charAt(i) != sX.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static boolean isPalindromeOptimized(int x) {
        // TODO:
        return true;
    }
}
