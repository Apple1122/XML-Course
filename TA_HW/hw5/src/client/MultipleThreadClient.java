package client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

public class MultipleThreadClient {
	
	private Scanner  in 				= null;
	protected String ip 				= null;
	protected int port					= 0;
	protected boolean isStopped 		= false;
	protected Vector<Socket> socketList = null;
	
	private void connect()
	{
		socketList = new Vector<>();
		in = new Scanner(System.in);
		while(!isStopped)
		{
			System.out.println("Please enter the ip: ");
			ip = in.nextLine();
			System.out.println("Please enter the port");
			port = Integer.parseInt(in.nextLine());
		
			try {
				Socket socket = new Socket();
				socket.connect(new InetSocketAddress(ip, port));
				
//				socketList.add(socket);			
				
				new Thread()
				{
					public void run()
					{
						try {
							DataInputStream input = new DataInputStream(socket.getInputStream());
							
							while(true)
							{
								System.out.println(input.readUTF());
							}
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}.start();
			} catch(Exception exc) {
				
			}
//			System.out.println("Keep going? (y/n) ");
//			String check = in.nextLine();
//			
//			if(check.equals("n"))
//				isStopped = true;
			
			
			
		}
		in.close();
//		this.receiveAll();
	}
	
//	private void receiveAll()
//	{
//		for(Socket socket : socketList)
//		{
//			new Thread()
//			{
//				public void run()
//				{
//					try {
//						DataInputStream input = new DataInputStream(socket.getInputStream());
//						
//						while(true)
//						{
//							System.out.println(input.readUTF());
//						}
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			}.start();
//		}
//	}

	public static void main(String[] args)
	{
		new MultipleThreadClient().connect();
	}
}
