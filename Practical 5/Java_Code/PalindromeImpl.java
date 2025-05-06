package Java_Code;



import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class PalindromeImpl extends UnicastRemoteObject implements Palindrome {
    protected PalindromeImpl() throws RemoteException {
        super();
    }


    public boolean isPalindrome(String str) throws RemoteException {
        System.out.println("Received: " + str);
        String reversed = new StringBuilder(str).reverse().toString();
        boolean result = str.equalsIgnoreCase(reversed);
        System.out.println("Sent: " + result);
        return result;
    }
}