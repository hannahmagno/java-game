import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class MyServer {
	public static void main(String args[]) {
		try {
			//initializing the connection
			ServerSocket ssocket = new ServerSocket(8888);
			System.out.println("S: accepting connections...");
			Socket s = ssocket.accept();
			System.out.println("S: Client connected!");
			Player1MyConnection conn = new Player1MyConnection(s);
			
			//MarioWindow and GameObject
			MarioWindow w1 = new MarioWindow();
			Player1Controller control = new Player1Controller();
			Player1Sender ssend = new Player1Sender(conn, control);
			Player1Receiver sreceive = new Player1Receiver(conn, control);
			w1.add(control);
			w1.add(ssend);
			w1.add(sreceive);
			w1.startGame();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
