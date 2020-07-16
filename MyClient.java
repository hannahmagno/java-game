import java.io.*;
import java.net.*;
import java.util.Scanner;
import javax.swing.*;

public class MyClient{
  public static void main(String args[]){
    try {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter server IP address: ");
		String ip = scanner.nextLine();
		System.out.print("Enter port number: ");
		int port = Integer.parseInt(scanner.nextLine());
        System.out.println("C: Connecting to server");
        
		Socket socket = new Socket(/*7.140.172.33"127.0.0.1"*,8888*/ ip,port); //lookback IP Address
        Player2MyConnection conn = new Player2MyConnection(socket);
        System.out.println("C: Connected");
        MarioWindow w1 = new MarioWindow();
        Player2Controller control = new Player2Controller();
        Player2Sender csend = new Player2Sender(conn, control);
        Player2Receiver creceive = new Player2Receiver(conn,control);
        w1.add(control);
        w1.add(csend);
        w1.add(creceive);
        w1.startGame();
    } catch (Exception e){
        e.printStackTrace();
		System.out.println(e);
    }
  }
}
