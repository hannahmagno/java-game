import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
public class Player1Controller extends GameObject {
	String go1;
	String go2;
	String start;
	int posx1, posy1, posx2, posy2,c,d,x,y;
	BufferedImage bg,board;
	BufferedImage throne;
	BufferedImage player1;
	BufferedImage player2;
	
	public Player1Controller() {
		go1 = " ";
		go2 = " ";
		posx2 = 278 + (7*87);
		posy2 = 615 - (7*87);
		posx1 = 278;
		posy1 = 615;
		c = 258;
		d = 0;
		x = 626;
		y = 267;
		bg = MarioWindow.getImage("m3.png");		
	}
	
	public void paint(Graphics2D g) {
		g.drawImage(bg, 0, 0, null);
		g.drawImage(board, 258, 0, null);
		g.drawImage(throne, x, y, null);
		g.drawImage(player1, posx1, posy1, null);
		g.drawImage(player2, posx2, posy2, null);
	}
	
	public void run() {
		MarioWindow.delay(2000);
		bg = MarioWindow.getImage("m4.png");
		MarioWindow.delay(1000);
		bg = MarioWindow.getImage("m4.png");
		bg = MarioWindow.getImage("P1.png");
		MarioWindow.delay(2000);
		bg = MarioWindow.getImage("background.png");
		board = MarioWindow.getImage("p3.png");
		throne = MarioWindow.getImage("throne.png");
	}
}
