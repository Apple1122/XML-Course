package guess.number;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer extends Thread{

	private ServerSocket server;
	private final int port = 8765;
	
	public SocketServer()
	{
		try {
			server = new ServerSocket(port);
			
		} 
		catch (IOException e) {

			e.printStackTrace();
		}
		
	}
	
	@Override 
	public void run()
	{
		Socket socket;
		DataInputStream input;
		DataOutputStream output;
		
		System.out.println("Server Start!");
		
		try {
			
			synchronized(server) 
			{
				socket = server.accept();
				
			}
			System.out.println("Connection Successful");
			
//			// set Timeout 
//			socket.setSoTimeout(15000);
			
			input = new DataInputStream(socket.getInputStream());
			output = new DataOutputStream(socket.getOutputStream());
			
			System.out.println(input.readUTF());
			
			boolean isAns = false;
			int ans = (int) ((Math.random()*100) + 1); // set ans
			
			while(!isAns)
			{
				// send to client: start to guess number
				output.writeUTF("Please guess the number: ");
				output.flush();
			
				// get the number from client
				int num = Integer.parseInt(input.readUTF());
				System.out.println(num);
				
				if(num == ans)
				{
					output.writeUTF("You are right!\n");
					isAns = true;
				}
				else if(num > ans)
					output.writeUTF("Your ans is bigger.\n");
				else
					output.writeUTF("Your ans is smaller.\n");
				
				output.flush();
			}
			server.close();
			socket.close();
				
			
			
		}
		catch(IOException exc) {
			System.out.println("Connection Failure");
			exc.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args)
	{
		(new SocketServer()).start();
	}
	
}
