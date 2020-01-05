package paquete;

import java.net.*;
import java.io.*;
public class server {
  static  DatagramSocket s;
    
   

    public static void main()throws SocketException,IOException{
        s=new  DatagramSocket (12345);
         thread th=new thread(s);
   
      

}    

   
}
