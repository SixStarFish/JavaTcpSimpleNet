package server.java.haixing.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

import javax.xml.stream.events.StartDocument;

import sun.java2d.pipe.BufferedRenderPipe;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Server{
	private ServerSocket serversocket;
	private Socket clientsocket;
	InputStream is;
	public Server()
	{
		try {
			serversocket=new ServerSocket(8888);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Server(int port)
	{
		try {
			serversocket=new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ServerStart()
	{
		try {
			System.out.println("*********服务器开始监听*************");
			//接受客户端消息，accept会阻塞
			clientsocket=serversocket.accept();
			//获取输入流
			is=clientsocket.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			//显示消息内容
			String str;
			while((str=br.readLine())!=null)
			{
				System.out.println(str);
			}
			//关闭资源
			br.close();
			isr.close();
			is.close();
			clientsocket.close();
			serversocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
