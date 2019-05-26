package server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class WorkerRunnable implements Runnable{

	protected Socket clientSocket = null;
	protected String serverName   = null;
	
	
	public WorkerRunnable(Socket socket, String serverName)
	{
		this.clientSocket = socket;
		this.serverName = serverName;
	}
	
	@Override
	public void run() 
	{
		try {
			DataOutputStream output = new DataOutputStream(this.clientSocket.getOutputStream());
			
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
