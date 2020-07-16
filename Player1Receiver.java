import java.util.Scanner;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class Player1Receiver extends GameObject {
	Player1MyConnection conn;
	Player1Controller controller;
	
	public Player1Receiver(Player1MyConnection pasok1, Player1Controller pasok2) {
		conn = pasok1;
		controller = pasok2;
	}

	public void run() {
		String msg = conn.getMessage(); //receives the chosen kingdom of player2 from Player2Sender
		
		//assigns the token for player2
		if (msg.equalsIgnoreCase("Forest")) {
			controller.player2 = MarioWindow.getImage("forest.png");
			controller.go2 = "change";
		} else if (msg.equalsIgnoreCase("Water")) {
			controller.player2 = MarioWindow.getImage("water.png");
			controller.go2 = "change";
		} else if (msg.equalsIgnoreCase("Candy")) {
			controller.player2 = MarioWindow.getImage("candy.png");
			controller.go2 = "change";
		} 
		
		//start of the game
		while (controller.go1.equals(controller.go1)) {
			String move = conn.getMessage(); //receives the movement of player2 from Player2Sender


			//for the movement of player2
			if (move.equalsIgnoreCase("Up")){
				if (controller.posx2 == controller.x && controller.posy2 == controller.y) {
					JOptionPane.showMessageDialog(null, "Player 2 gets the throne!");
					System.exit(0);
				} else if ((controller.posx2 != 278 && controller.posy2 != 6) || (controller.posx2 != 365 && controller.posy2 != 6) || (controller.posx2 != 452 && controller.posy2 != 6) || (controller.posx2 != 539 && controller.posy2 != 6) || (controller.posx2 != 629 && controller.posy2 != 6) || (controller.posx2 != 713 && controller.posy2 != 6) || (controller.posx2 != 800 && controller.posy2 != 6) || (controller.posx2 != 887 && controller.posy2 != 6)) {
						controller.posy2 = controller.posy2 - 87;//player2 moves up
				} 
			} else if (move.equalsIgnoreCase("Down")){

				if ((controller.posx2 != 887 && controller.posy2 != 615) || (controller.posx2 != 800 && controller.posy2 != 615) || (controller.posx2 != 713 && controller.posy2 != 615) || (controller.posx2 != 629 && controller.posy2 != 615) || (controller.posx2 != 539 && controller.posy2 != 615) || (controller.posx2 != 452 && controller.posy2 != 615) || (controller.posx2 != 365 && controller.posy2 != 615) || (controller.posx2 != 278 && controller.posy2 != 615)) {
						controller.posy2 = controller.posy2 + 87;//player2 moves up
				}
				if (controller.posx2 == controller.x && controller.posy2 == controller.y) {
					JOptionPane.showMessageDialog(null, "Player 2 gets the throne!");
					System.exit(0);
				}
				
			} else if (move.equalsIgnoreCase("Right")){;
				if ((controller.posx2 != 887 && controller.posy2 != 93) || (controller.posx2 != 887 && controller.posy2 != 180) || (controller.posx2 != 887 && controller.posy2 != 267) || (controller.posx2 != 887 && controller.posy2 != 354) || (controller.posx2 != 887 && controller.posy2 != 93) || (controller.posx2 != 887 && controller.posy2 != 441) || (controller.posx2 != 887 && controller.posy2 != 528) || (controller.posx2 != 887 && controller.posy2 != 6)) {
					controller.posx2 = controller.posx2 + 87;//player2 moves to rhe right
				}
				if (controller.posx2 == controller.x && controller.posy2 == controller.y) {
					JOptionPane.showMessageDialog(null, "Player 2 gets the throne!");
					System.exit(0);
				}
				
			} else if (move.equalsIgnoreCase("Left")){
				if ((controller.posx2 != 278 && controller.posy2 != 615)  || (controller.posx2 != 278 && controller.posy2 != 528) || (controller.posx2 != 278 && controller.posy2 != 441) || (controller.posx2 != 278 && controller.posy2 != 354) || (controller.posx2 != 278 && controller.posy2 != 267) || (controller.posx2 != 278 && controller.posy2 != 180) || (controller.posx2 != 278 && controller.posy2 != 93) || (controller.posx2 != 278 && controller.posy2 != 6)) {
					controller.posx2 = controller.posx2 - 87;//player2 moves up
				}
				if (controller.posx2 == controller.x && controller.posy2 == controller.y) {
					JOptionPane.showMessageDialog(null, "Player 2 gets the throne!");
					System.exit(0);
				}
				
			}  	
		}
	}
}

/*

import java.util.Scanner;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class Player1Receiver extends GameObject {
	Player1MyConnection conn;
	Player1Controller controller;
	
	public ServerReceiver(Player1MyConnection pasok1, Player1Controller pasok2) {
		conn = pasok1;
		controller = pasok2;
	}

	public void run() {
		String msg = conn.getMessage();
		if (msg.equalsIgnoreCase("Forest")) {
			controller.player2 = MarioWindow.getImage("forest.png");
		} else if (msg.equalsIgnoreCase("Water")) {
			controller.player2 = MarioWindow.getImage("water.png");
		} else if (msg.equalsIgnoreCase("Candy")) {
			controller.player2 = MarioWindow.getImage("candy.png");
		} 
		
		/*while (true) {
			System.out.println("S: Waiting for client's color...");
			String msg = conn.getMessage();
			System.out.println("S: Client wants to have color " + msg);
			//controller.msg = msg;
			//modify controller to change the color of the client's circle
			if (msg.equalsIgnoreCase("Red")) {
				controller.c2 = Color.RED;
			} else if (msg.equalsIgnoreCase("Blue")) {
				controller.c2 = Color.BLUE;
			}
			if(msg.equals("Over")||msg.equals("over")||msg.equals("OVER")) {
				break;
			}
		}*/

 	





