package Code;

import java.io.*;
import java.net.*;
public class Ip1 {
    public static void main(String[] args) {
        try{
            InetAddress ip=InetAddress.getByName("amazon.com");
            System.out.println("Host Name: "+ip.getHostName());
            System.out.println("IP Address:"+ip.getHostAddress());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
