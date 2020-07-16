import java.util.Scanner;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Player2Receiver extends GameObject{
	Player2MyConnection conn;
	Player2Controller controller;
	Scanner pogi;
	
	public Player2Receiver(Player2MyConnection pasok1,Player2Controller pasok2){
		conn = pasok1;
		controller = pasok2;
	}
	
	public void run(){
		String msg = conn.getMessage(); //receiver the chosen kingdom of player1 from Player1Sender
		
		//assigns the token for player1
		if (msg.equalsIgnoreCase("sun")){
			controller.player1 =MarioWindow.getImage("sun.png");
			controller.go1 = "change";
		} else if (msg.equalsIgnoreCase("moon")){
			controller.player1 =MarioWindow.getImage("moon.png");
			controller.go1 = "change";
		}
		
		//start of game
		while (controller.go2.equals(controller.go1)) {
			String move = conn.getMessage(); //receives the movement of player1 from Player1Sender
	
			//for the movement of player1
			if (move.equalsIgnoreCase("up")) {
				
				
				//PSEUDOCODE NUNG MOVEMENT (chinecheck kung lalagpas, kung may life/bomb/flag) 
				if ((controller.posx1 != 278 && controller.posy1 != 6) || (controller.posx1 != 365 && controller.posy1 != 6) || (controller.posx1 != 452 && controller.posy1 != 6) || (controller.posx1 != 539 && controller.posy1 != 6) || (controller.posx1 != 629 && controller.posy1 != 6) || (controller.posx1 != 713 && controller.posy1 != 6) || (controller.posx1 != 800 && controller.posy1 != 6) || (controller.posx1 != 887 && controller.posy1 != 6)) {
						//player1 moves up
						controller.posy1 = controller.posy1 - 87;
				}
				if (controller.posx1 == controller.x && controller.posy1 == controller.y) {
					JOptionPane.showMessageDialog(null, "Player 1 gets the throne!");
					System.exit(0);
				} 
				
				
			} else if (move.equalsIgnoreCase("down")) {
				//player1 moves down
				
				//PSEUDOCODE NUNG MOVEMENT (chinecheck kung lalagpas, kung may life/bomb/flag) 
				if ( (controller.posx1 != 887 && controller.posy1 != 615) || (controller.posx1 != 800 && controller.posy1 != 615) || (controller.posx1 != 713 && controller.posy1 != 615) || (controller.posx1 != 629 && controller.posy1 != 615) || (controller.posx1 != 539 && controller.posy1 != 615) || (controller.posx1 != 452 && controller.posy1 != 615) || (controller.posx1 != 365 && controller.posy1 != 615) || (controller.posx1 != 278 && controller.posy1 != 615) ) {
						controller.posy1 = controller.posy1 + 87;//player1 moves down
				}
				if (controller.posx1 == controller.x && controller.posy1 == controller.y) {
					JOptionPane.showMessageDialog(null, "Player 1 gets the throne!");
					System.exit(0);
				} 
				
				
			} else if (move.equalsIgnoreCase("right")) {
				//player1 moves right
				
				//PSEUDOCODE NUNG MOVEMENT (chinecheck kung lalagpas, kung may life/bomb/flag) 
				if ( (controller.posx1 != 887 && controller.posy1 != 93) || (controller.posx1 != 887 && controller.posy1 != 180) || (controller.posx1 != 887 && controller.posy1 != 267) || (controller.posx1 != 887 && controller.posy1 != 354) || (controller.posx1 != 887 && controller.posy1 != 93) || (controller.posx1 != 887 && controller.posy1 != 441) || (controller.posx1 != 887 && controller.posy1 != 528) || (controller.posx1 != 887 && controller.posy1 != 6) ) {
						controller.posx1 = controller.posx1 + 87; //player1 moves to the right
				}
				if (controller.posx1 == controller.x && controller.posy1 == controller.y) {
					JOptionPane.showMessageDialog(null, "Player 1 gets the throne!");
					System.exit(0);
				}
				
				
			} else if (move.equalsIgnoreCase("left")) {
				//player1 moves left
				
				//PSEUDOCODE NUNG MOVEMENT (chinecheck kung lalagpas, kung may life/bomb/flag) 
				if ( (controller.posx1 != 278 && controller.posy1 != 615) || (controller.posx1 != 278 && controller.posy1 != 528) || (controller.posx1 != 278 && controller.posy1 != 441) || (controller.posx1 != 278 && controller.posy1 != 354) || (controller.posx1 != 278 && controller.posy1 != 267) || (controller.posx1 != 278 && controller.posy1 != 180) || (controller.posx1 != 278 && controller.posy1 != 93) || (controller.posx1 != 278 && controller.posy1 != 6) ) {
						controller.posx1 = controller.posx1 - 87; //player1 moves left
				}
				if (controller.posx1 == controller.x && controller.posy1 == controller.y) {
					JOptionPane.showMessageDialog(null, "Player 1 gets the throne!");
					System.exit(0);
				}
				
			}
		}		
	}
}