package Java_Code;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class PalindromeServer {
    public static void main(String[] args) {
        try {
            PalindromeImpl palindromeService = new PalindromeImpl();
            Registry registry = LocateRegistry.createRegistry(1884);
            String name = "palindrome";
            registry.rebind(name, palindromeService);
            System.out.println("Palindrome Server is ready...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}