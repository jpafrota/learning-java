package exer01;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class TCP_ObjIntClient {
    
    public final static int PORT = 2222;
    
    public static void main(String[] args) throws Exception {
        
        String hostname = args.length > 0 ? args[0] : "localhost";
            Socket server = new Socket(hostname, PORT);
            
            ObjectInputStream entrada = new ObjectInputStream(server.getInputStream());
            
            Integer serverData = (Integer) entrada.readObject();
            System.out.println("Valor recebido (client): " + (int)serverData);

            ObjectOutputStream output = new ObjectOutputStream(server.getOutputStream());
            
            Integer data = serverData + 1;
            output.writeObject(data);
            System.out.println("Valor enviado (client): " + (int)data);
            
            serverData = (Integer) entrada.readObject();
            System.out.println("Valor recebido (client): " + (int)serverData);
            
            entrada.close();
            server.close(); 
    }
            
}