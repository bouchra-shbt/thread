package paquete;
import java.net.*;
import java.io.*;

public class thread  extends Thread{
     static DatagramSocket s;
     static  DatagramPacket recu;
     static byte[] msg;
    public thread(DatagramSocket s){
       this.s=s;// instanciation du thread
     
        msg=new byte[1024];
         System.out.println("started ts...");
       start();// demarrage du thread
    }
    
    public void run(){
         try {
            while(true){
            recu=new DatagramPacket(msg,1024);
            s.receive(recu);//le server reçu le packet
            int tampon =recu.getLength();
// déclaration de la variable qui recevra les messages du client
            String data=new String(recu.getData());
//cet appel de méthode permet d'extraire de data les caractères effectivement envoyés ; 
//cela fonctionne parce qu'ici chaque caractère a été codé sur un seul octet et
//donc la longueur du message est égale au nombre de caractères envoyés 
            data=data.substring(0,tampon);
            // permet d'obtenir une nouvelle chaîne sans espaces au début ou à la fin. 
            //data=data.trim();
            int valeur=Integer.parseInt(data);
//parseInt()convertit l’élément String qui lui est passé en un entier int
            int fac=factoriel.getValor( valeur);
            facserver.IblResultat.setText("factoriel de "+valeur+ "est:"+fac);
 }
        }catch (IOException ex) {}
        
        }
    }
    
    

