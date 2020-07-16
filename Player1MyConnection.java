import java.io.*;
import java.net.*;
public class Player1MyConnection {
	Socket s;
	PrintWriter out;
	BufferedReader in;
	
	public Player1MyConnection(Socket s) {
		try {
			this.s = s;
			this.out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			this.in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean sendMessage(String msg) {
		try {
			out.println(msg);
			out.flush();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public String getMessage() {
		try {
			return in.readLine();
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void close() {
		try {
			in.close();
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


}
