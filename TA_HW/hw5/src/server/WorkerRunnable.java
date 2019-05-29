package server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class WorkerRunnable implements Runnable{

	protected Socket clientSocket 	= null;
	protected String serverName   	= null;
	private DataOutputStream output = null;
	
	public WorkerRunnable(Socket socket)
	{
		this.clientSocket = socket;
		
		try 
		{
			output = new DataOutputStream(socket.getOutputStream());
		} 
		catch (IOException e) {
						e.printStackTrace();
		}
	}
	
	public void sendMessage(String messsage)
	{
		try 
		{
			output.writeUTF(messsage);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() 
	{
		try {
//			 output = new DataOutputStream(this.clientSocket.getOutputStream());
			
			while(true)
			{
				output.writeUTF("I am server: " + this.serverName);
				
//				synchronized(this)
//				{
//					Thread.currentThread().sleep(1000);;
//				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
}
