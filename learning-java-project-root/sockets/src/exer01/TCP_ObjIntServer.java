package exer01;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCP_ObjIntServer {

	public final static int PORT = 2222;

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ServerSocket server = new ServerSocket(PORT);
		Random rand = new Random();

		Integer f;

		while (true) {
			f = (Integer) rand.nextInt(500) + 100;
			Socket client = server.accept();
			InetAddress clientAddr = client.getInetAddress();
			System.out.println("Cliente conectado: " + clientAddr.getHostAddress());

			System.out.println("Valor enviado (server): " + f);
			ObjectOutputStream out = new ObjectOutputStream(client.getOutputStream());
			out.writeObject(f);

			ObjectInputStream entrada = new ObjectInputStream(client.getInputStream());
			int g = (int) entrada.readObject();
			System.out.println("Valor recebido de volta (server): " + g);

			f = (Integer) g + 2;

			System.out.println("Valor enviado (server): " + f);
			out.writeObject(f);
			
			out.close();
			client.close();
		}
		
	}
}