package guess.number;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {

	private String address = "127.0.0.1"; // connect ip
	private int port = 8765;
	
	public SocketClient()
	{
		Socket client = new Socket();
		InetSocketAddress isa = new InetSocketAddress(this.address, this.port);
		Scanner scanner = new Scanner(System.in);
		
		DataInputStream input;
		DataOutputStream output;
		boolean isRight = false;
		
		try {
			client.connect(isa, 10000);
			
			input = new DataInputStream(client.getInputStream());
			output = new DataOutputStream(client.getOutputStream());
				
			output.writeUTF("I'm already.");
			output.flush();
			
			while(!isRight)
			{
				System.out.println(input.readUTF());
				
				
				// guess the number
				String num = scanner.nextLine();
				output.writeUTF(num);
				output.flush();
				
				// get the result
				String result = input.readUTF();
				System.out.println(result);
				
				if(result.equals("You are right!"))
					isRight = true;
			}
			
			
			
		}
		catch(IOException exc) {
			exc.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		new SocketClient();
	}

}
