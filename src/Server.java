import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by eduardorobles on 5/12/17.
 */
public class Server
{
    //port number and list of Client Handlers
    private int port;
    private ServerSocket serverSocket;
    private Socket clientSocket;

    public Server(int port)
    {
        this.port = port;
    }

    public void run()
    {
        try
        {
            //create the server socket
            serverSocket = new ServerSocket(this.port);
            System.out.println("Server Started....");
            //keep looping forever to receive connections
            while(true)
            {
                System.out.println("Waiting for Client Connection....");
                clientSocket = serverSocket.accept();
                System.out.println("Connection accepted from: "+clientSocket);

                //create a new thread to handle that client
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String [] args)
    {
        int port = 4444;
        Server mainServer = new Server(port);
        mainServer.run();
    }
}