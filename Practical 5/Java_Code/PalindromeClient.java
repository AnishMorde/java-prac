package Java_Code;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class PalindromeClient {
    public static void main(String[] args) {
        try {
            String name = "palindrome";
            Registry registry = LocateRegistry.getRegistry(1884);
            Palindrome palindromeService = (Palindrome) registry.lookup(name);

            String testString = "rotor";  // Change this to test other strings
            boolean result = palindromeService.isPalindrome(testString);

            System.out.println("Sent: " + testString);
            System.out.println("Received: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}