import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try {
            //create server socket for listing request
            ServerSocket serverSocket = new ServerSocket(3000);
            System.out.println("Chat Started");

            //Local Socket
            Socket socket = serverSocket.accept();

            System.out.println("Accepted!");

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String message = dataInputStream.readUTF();
            System.out.println("Server"+message);

        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
