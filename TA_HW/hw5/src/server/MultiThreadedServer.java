package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

public class MultiThreadedServer implements Runnable{

//	protected int          serverPort   = 5000;
    protected ServerSocket serverSocket = null;
    protected boolean      isStopped    = false;
    protected Thread       runningThread= null;
    private Scanner 	   in			= null;
    private String 		   serverName	= null;
	
	public MultiThreadedServer()
	{
		in = new Scanner(System.in);
		System.out.println("Please name the server: ");
		this.serverName = in.nextLine();
	}

	@Override
	public void run() 
	{
		synchronized(this)
		{
			runningThread = Thread.currentThread();
		}
		this.openServerSocket();
		
		while(!isStopped())
		{
			Socket clientSocket = null;
			try {
				clientSocket = this.serverSocket.accept();
			} catch(IOException exc) {
				
			}
			
			// new Thread
			new Thread( 
					new WorkerRunnable(clientSocket, this.serverName) 
					).start();
			
		}
		System.out.println("Server Stopped.") ;
	
	}	
	
	private synchronized boolean isStopped()
	{
		return this.isStopped;
	}
	
	public synchronized void stop()
	{
		this.isStopped = true;
        try {
            this.serverSocket.close();
        } catch (IOException e) {
            throw new RuntimeException("Error closing server", e);
        }
	}
	
	private void openServerSocket()
	{
		try {
			serverSocket = new ServerSocket(5000 + (int)(Math.random() * 1000 + 1));
			System.out.println("listening port: " + serverSocket.getLocalPort());
			
		} catch(Exception exc) {
			this.openServerSocket();
			exc.printStackTrace();
		}
	}

	public static void main(String[] args)
	{
		MultiThreadedServer server = new MultiThreadedServer();
		new Thread(server).start();

//		try {
//		    Thread.sleep(20 * 1000);
//		} catch (InterruptedException e) {
//		    e.printStackTrace();
//		}
	}
}
