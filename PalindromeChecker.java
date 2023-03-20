import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("THAT IS A PALINDROME!");
        } else {
            System.out.println("THAT IS NOT A PALINDROME!");
        }
    }

    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        int len = str.length();
        int mid = len / 2;

        // Push the first half of the string onto the stack
        for (int i = 0; i < mid; i++) {
            stack.push(str.charAt(i));
        }

        // Pop the characters from the stack and compare with the second half of the string
        int i = (len % 2 == 0) ? mid : mid + 1;
        while (i < len) {
            char c = stack.pop();
            if (c != str.charAt(i)) {
                return false;
            }
            i++;
        }

        return true;
    }
}