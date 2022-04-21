
import java.io.*;
import java.net.*;

public class Client {
  public static void main(String[] args) {
    
    //porta del server e indirizzo ip del client
    int port= 2000;
    String ip= "127.0.0.1";
    
    try{
      Socket socket= new Socket(ip, port);
      
      //ricevimento dal server (non funziona)
      DataInputStream dis=new DataInputStream(socket.getInputStream());
      String str=(String)dis.readUTF();
      
    }catch(Exception e){
        System.err.println(e);
    }
  }
}
