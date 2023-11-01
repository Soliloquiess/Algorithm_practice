import java.net.*;
import java.util.Scanner;
import java.io.*;
public class Project06A_Client {
	public static void main(String[] args) {
       try {	//바로 소켓 들어가므로 바로 예외처리
		   Socket socket=new Socket("127.0.0.1", 9999); // -------->accept()
    	   System.out.println("Connection Success!");
    	   Scanner scanner=new Scanner(System.in);
    	   String message=scanner.nextLine();
    	   OutputStream out=socket.getOutputStream();
    	   DataOutputStream dos=new DataOutputStream(out);
    	   dos.writeUTF(message);
 
    	   InputStream in=socket.getInputStream();
    	   DataInputStream dis=new DataInputStream(in);
    	   System.out.println("Receive:"+dis.readUTF());
    	   
    	   dis.close();
    	   dos.close();
    	   socket.close();
	   } catch (Exception e) {
		  e.printStackTrace();
	   }		
	}
}
