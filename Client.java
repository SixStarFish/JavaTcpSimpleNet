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
			//ָ����������Ӧ��socket
			Socket mySocket=new Socket("127.0.0.1",8887);
			//��ȡ�����
			OutputStream os=mySocket.getOutputStream();
			PrintWriter pw=new PrintWriter(os);
			//����ѶϢ
			pw.write("������ǿͻ��ˣ�����������");
			pw.flush();
			//�ر�������Դ
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
