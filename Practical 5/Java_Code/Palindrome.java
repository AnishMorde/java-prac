package Java_Code;

import java.rmi.*;

public interface Palindrome extends Remote {
    boolean isPalindrome(String str) throws RemoteException;
}