package paquete;


import java.net.*;
import java.io.*;
import static paquete.server.s;
public class client {
    static DatagramPacket paquete;
    static DatagramSocket socketClient;
    static byte[] information;
    public static void main()throws SocketException{    //initialisation
        socketClient=new DatagramSocket();
        System.out.println("client started......");
     
      
    }
     // on construit le paquet a envoyer       
    public static void send(String numéro) throws SocketException,IOException{
// Permet d'envoyer les données contenues dans la variable data vers la machine et le port dont
  //les valeurs ont été préalablement spécifiées dans la variable data.
        information=new byte[numéro.length()];//longueur 
        information=numéro.getBytes();//tampon  Retourne les données stockées dans le paquet.
        //retourne un tableau de byte correspondant aux données du datagramme.
        paquete =  new DatagramPacket(information, information.length, new InetSocketAddress("127.0.0.1",12345)); 
        socketClient.send(paquete);//le client envoie le packet
                
    }

   
}

				