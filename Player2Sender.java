import java.util.Scanner;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Player2Sender extends GameObject{
	Player2MyConnection conn;
	Player2Controller controller;
	Scanner pogi;
	String move;
	
	public Player2Sender(Player2MyConnection pasok1, Player2Controller pasok2){
		conn = pasok1;
		controller = pasok2;
		pogi = new Scanner(System.in);
	}
	
	public void run(){
		MarioWindow.delay(4500);
		String msg = JOptionPane.showInputDialog("Choose a kingdom - FOREST | WATER | CANDY ");
		while(!msg.equalsIgnoreCase("forest") && !msg.equalsIgnoreCase("water")&&!msg.equalsIgnoreCase("candy")) {
				msg = JOptionPane.showInputDialog("Choose a kingdom - FOREST | WATER | CANDY ");
				/*if(msg.equalsIgnoreCase("forest")||msg.equalsIgnoreCase("candy")||msg.equalsIgnoreCase("water")){
					break;
				}*/
		}
		conn.sendMessage(msg); //sends the chosen kingdom of player2 to Player1Receiver
		
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
		
		
		//start of game
		while (controller.go2.equals(controller.go1)) {
			conn.sendMessage(move); //sends the movement of player2 to player1Receiver
			
			//while (true) {
			//for the movement of player2
			if (move.equals("up")) {
					
			} else if (move.equals("down")) {

			} else if (move.equals("right")) {
			} else if (move.equals("left")) {
				

			} 
		}	
	}

	
	public void keyPressed(String key){
		//while (true) {
			System.out.println(key);

			if (key.equalsIgnoreCase("Up")){
				move = "up";
				conn.sendMessage(move);
				if ((controller.posx2 != 278 && controller.posy2 != 6) || (controller.posx2 != 365 && controller.posy2 != 6) || (controller.posx2 != 452 && controller.posy2 != 6) || (controller.posx2 != 539 && controller.posy2 != 6) || (controller.posx2 != 629 && controller.posy2 != 6) || (controller.posx2 != 713 && controller.posy2 != 6) || (controller.posx2 != 800 && controller.posy2 != 6) || (controller.posx2 != 887 && controller.posy2 != 6)) {
						controller.posy2 = controller.posy2 - 87;//player2 moves up
				}
				if (controller.posx2 == controller.x && controller.posy2 == controller.y) {
					JOptionPane.showMessageDialog(null, "Player 2 gets the throne!");
					System.exit(0);
				}
			} else if (key.equalsIgnoreCase("Down")){
				move = "down";
				conn.sendMessage(move);
				if ((controller.posx2 != 887 && controller.posy2 != 615) || (controller.posx2 != 800 && controller.posy2 != 615) || (controller.posx2 != 713 && controller.posy2 != 615) || (controller.posx2 != 629 && controller.posy2 != 615) || (controller.posx2 != 539 && controller.posy2 != 615) || (controller.posx2 != 452 && controller.posy2 != 615) || (controller.posx2 != 365 && controller.posy2 != 615) || (controller.posx2 != 278 && controller.posy2 != 615)) {
						controller.posy2 = controller.posy2 + 87;//player2 moves up
				}
				if (controller.posx2 == controller.x && controller.posy2 == controller.y) {
					JOptionPane.showMessageDialog(null, "Player 2 gets the throne!");
					System.exit(0);
				}
			} else if (key.equalsIgnoreCase("Right")){
				move = "right";
				conn.sendMessage(move);
				if ((controller.posx2 != 887 && controller.posy2 != 93) || (controller.posx2 != 887 && controller.posy2 != 180) || (controller.posx2 != 887 && controller.posy2 != 267) || (controller.posx2 != 887 && controller.posy2 != 354) || (controller.posx2 != 887 && controller.posy2 != 93) || (controller.posx2 != 887 && controller.posy2 != 441) || (controller.posx2 != 887 && controller.posy2 != 528) || (controller.posx2 != 887 && controller.posy2 != 6)) {
					controller.posx2 = controller.posx2 + 87;//player2 moves to rhe right
				}
				if (controller.posx2 == controller.x && controller.posy2 == controller.y) {
					JOptionPane.showMessageDialog(null, "Player 2 gets the throne!");
					System.exit(0);
				}
				
			} else if (key.equalsIgnoreCase("Left")){
				move = "left";
				conn.sendMessage(move);
						
				if ((controller.posx2 != 278 && controller.posy2 != 615)  || (controller.posx2 != 278 && controller.posy2 != 528) || (controller.posx2 != 278 && controller.posy2 != 441) || (controller.posx2 != 278 && controller.posy2 != 354) || (controller.posx2 != 278 && controller.posy2 != 267) || (controller.posx2 != 278 && controller.posy2 != 180) || (controller.posx2 != 278 && controller.posy2 != 93) || (controller.posx2 != 278 && controller.posy2 != 6)) {
					controller.posx2 = controller.posx2 - 87;//player2 moves up
				}
				if (controller.posx2 == controller.x && controller.posy2 == controller.y) {
					JOptionPane.showMessageDialog(null, "Player 2 gets the throne!");
					System.exit(0);
				}
				
			}  
		//}
	}
	
	
}
















