
package paquete;

import java.net.*;
import java.io.*;
public class hiloRecibir extends Thread{
    private DatagramSocket s;
  // private DatagramSocket socketClient;
     static  DatagramPacket recu;
      static byte[] msg;
    public hiloRecibir(DatagramSocket s){
       this.s=s;
      // this.socketClient=socketClient;
        msg=new byte[1024];
         System.out.println("started hilo...");
       start();
    }
    public void run(){
         
        try {
            while(true){
            recu=new DatagramPacket(msg,1024);
            s.receive(recu);
           
            int tam =recu.getLength();
            String data=new String(recu.getData());
            data=data.substring(0,tam);
            data=data.trim();
            int valeur=Integer.parseInt(data);
           //System.out.println("numéro"+valeur);
            int fac=factoriel.getValor( valeur);
             //System.out.println("factoriel"+fac);
     
    facserver.IblResultat.setText("factoriel de   "+valeur+"  est :"+fac);
  // facclient.bResultat.setText("factoriel de "+valeur+ "est:"+fac);

        }
        }catch (IOException ex) {}
        
        }
    }
    


    
    

