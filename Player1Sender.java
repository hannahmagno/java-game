import java.util.Scanner;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Player1Sender extends GameObject {
	Player1MyConnection conn;
	Player1Controller controller;
	Scanner pogi;
	String move;
	
	public Player1Sender(Player1MyConnection pasok1, Player1Controller pasok2) {
		conn = pasok1;
		controller = pasok2;
		pogi = new Scanner(System.in);
	}
	
	public void run() {
		
		MarioWindow.delay(4500);
		
		String msg = JOptionPane.showInputDialog("Choose a kingdom - SUN | MOON ");
		while(!msg.equalsIgnoreCase("sun") && !msg.equalsIgnoreCase("moon")) {
				msg = JOptionPane.showInputDialog("Choose a kingdom - SUN | MOON ");
				
		}
		
		conn.sendMessage(msg); //sends the chosen kingdom of player1
		//assigns the token for player1
		if (msg.equalsIgnoreCase("sun")){
			controller.player1 = MarioWindow.getImage("sun.png");
			controller.go1 = "change";
		} else if (msg.equalsIgnoreCase("moon")){
			controller.player1 = MarioWindow.getImage("moon.png");
			controller.go1 = "change";
		}
		
		//start of the game
		while(controller.go1.equals(controller.go2)) {
			conn.sendMessage(move); //sends the movement of player1 to player2Receiver
			
			//for the movement of player1
			if (move.equals("up")) {
				
			} else if (move.equals("down")) {

			} else if (move.equals("right")) {
				
			} else if (move.equals("left")) {
				
			} 
		
		}
			
	}


	public void keyPressed(String key){
		System.out.println(key);
	
		if (key.equalsIgnoreCase("up")){
			move = "up";
			conn.sendMessage(move);
			if ((controller.posx1 != 278 && controller.posy1 != 6) || (controller.posx1 != 365 && controller.posy1 != 6) || (controller.posx1 != 452 && controller.posy1 != 6) || (controller.posx1 != 539 && controller.posy1 != 6) || (controller.posx1 != 629 && controller.posy1 != 6) || (controller.posx1 != 713 && controller.posy1 != 6) || (controller.posx1 != 800 && controller.posy1 != 6) || (controller.posx1 != 887 && controller.posy1 != 6)) {
						//player1 moves up				
						controller.posy1 = controller.posy1 - 87;
						//JOptionPane.showMessageDialog(null,"posy1: "+controller.posy1);
			} 
			if (controller.posx1 == controller.x && controller.posy1 == controller.y) {
				JOptionPane.showMessageDialog(null, "Player 1 gets the throne!");
				System.exit(0);
			} 
			
			
		} else if (key.equalsIgnoreCase("down")){
			move = "down";
			conn.sendMessage(move);
			
			if ( (controller.posx1 != 887 && controller.posy1 != 615) || (controller.posx1 != 800 && controller.posy1 != 615) || (controller.posx1 != 713 && controller.posy1 != 615) || (controller.posx1 != 629 && controller.posy1 != 615) || (controller.posx1 != 539 && controller.posy1 != 615) || (controller.posx1 != 452 && controller.posy1 != 615) || (controller.posx1 != 365 && controller.posy1 != 615) || (controller.posx1 != 278 && controller.posy1 != 615) ) {
						
						controller.posy1 = controller.posy1 + 87;//player1 moves down
						//JOptionPane.showMessageDialog(null,"posy1: "+controller.posy1);
			} 
			if (controller.posx1 == controller.x && controller.posy1 == controller.y) {
				JOptionPane.showMessageDialog(null, "Player 1 gets the throne!");
				System.exit(0);
			} 
		} else if (key.equalsIgnoreCase("right")){
			move = "right";
			conn.sendMessage(move);
			if ( (controller.posx1 != 887 && controller.posy1 != 93) || (controller.posx1 != 887 && controller.posy1 != 180) || (controller.posx1 != 887 && controller.posy1 != 267) || (controller.posx1 != 887 && controller.posy1 != 354) || (controller.posx1 != 887 && controller.posy1 != 93) || (controller.posx1 != 887 && controller.posy1 != 441) || (controller.posx1 != 887 && controller.posy1 != 528) || (controller.posx1 != 887 && controller.posy1 != 6) ) {
						
						controller.posx1 = controller.posx1 + 87; //player1 moves to the right
						//JOptionPane.showMessageDialog(null,"posy1: "+controller.posx1);
			}
			if (controller.posx1 == controller.x && controller.posy1 == controller.y) {
				JOptionPane.showMessageDialog(null, "Player 1 gets the throne!");
				System.exit(0);
			} 
			
		} else if (key.equalsIgnoreCase("left")){
			move = "left";
			conn.sendMessage(move);
			if ((controller.posx1 != 278 && controller.posy1 != 615)  || (controller.posx1 != 278 && controller.posy1 != 528) || (controller.posx1 != 278 && controller.posy1 != 441) || (controller.posx1 != 278 && controller.posy1 != 354) || (controller.posx1 != 278 && controller.posy1 != 267) || (controller.posx1 != 278 && controller.posy1 != 180) || (controller.posx1 != 278 && controller.posy1 != 93) || (controller.posx1 != 278 && controller.posy1 != 6)) {
						
						controller.posx1 = controller.posx1 - 87; //player1 moves left
						//JOptionPane.showMessageDialog(null,"posy1: "+controller.posx1);
				
			}
			if (controller.posx1 == controller.x && controller.posy1 == controller.y) {
				JOptionPane.showMessageDialog(null, "Player 1 gets the throne!");
				System.exit(0);
			} 
			
		}  
		
	}
	
	
	
	
	


















}











/*


import java.util.Scanner;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class Player1Sender extends GameObject {
	Player1MyConnection conn;
	Player1Controller controller;
	Scanner pogi;
	
	public ServerSender(Player1MyConnection pasok1, Player1Controller pasok2) {
		conn = pasok1;
		controller = pasok2;
		pogi = new Scanner(System.in);
	}
	
	public void run() {
		String msg = JOptionPane.showInputDialog("Enter your chosen kingdom: ");
		conn.sendMessage(msg);
		
		if (msg.equalsIgnoreCase("sun")){
			controller.player1 =MarioWindow.getImage("sun.png")
		} else if (msg.equalsIgnoreCase("moon")){
			controller.player1 =MarioWindow.getImage("moon.png")
		}
		
		
		
		
		/*while (true) {
			System.out.print("S: Enter the color you like: ");
			String msg = pogi.nextLine();
			System.out.println("S: You want to have color " + msg);
			conn.sendMessage(msg); //send message to client
			//controller.msg1 = msg;
			//modify controller to change the color of the Server's circle
			if (msg.equalsIgnoreCase("Red")) {
				controller.c1 = Color.RED;
			} else if (msg.equalsIgnoreCase("Blue")) {
				controller.c1 = Color.BLUE;
			}
			
			if(msg.equals("Over")||msg.equals("over")||msg.equals("OVER")) {
				break;
			}
			
		}*/
