package ece155b.top.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

import ece155b.doctor.data.Doctor;


public class TopServer implements Runnable{

	protected ServerSocket serverSocket  = null;
    protected boolean      isStopped     = false;
    protected Thread       runningThread = null;
    private Vector<Doctor> doctors;
	
	public TopServer()
	{
		doctors = new Vector<>();
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
			
			try 
			{
				this.addClient(serverSocket.accept());
			} 
			catch(IOException exc) 
			{
				exc.printStackTrace();
			}
			
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
	
	public void addClient(Socket socket)
	{
		this.doctors.add(new Doctor());
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
		Scanner in = new Scanner(System.in);

		TopServer server = new TopServer();
		// another thread to handle adding client
		new Thread(server).start();
		
		Thread main = Thread.currentThread();
		try {
			main.sleep(1000);
		} catch (InterruptedException e) {
						e.printStackTrace();
		}
		// main thread to handle send message 
		while(true)
		{
			System.out.println("input message: ");
			String message = in.nextLine();
			

		}

	}
}
