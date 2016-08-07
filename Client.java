package client.java.haixing.com;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public void send()
	{
		try {
			//指定服务器对应的socket
			Socket mySocket=new Socket("127.0.0.1",8887);
			//获取输出流
			OutputStream os=mySocket.getOutputStream();
			PrintWriter pw=new PrintWriter(os);
			//发出讯息
			pw.write("你好我是客户端！！嘻嘻！！");
			pw.flush();
			//关闭所有资源
			pw.close();
			os.close();
			mySocket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
