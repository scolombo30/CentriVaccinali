package cittadini;

// EchoClient.java
import java.net.*;
import java.io.*;
public class EchoClient {
    public static void main(String[] args) throws IOException {
 ;
        Socket socket=null;
        ObjectOutputStream out=null;
        ObjectInputStream in=null;

        BufferedReader stdIn=null;

        try {
            // creazione socket
            socket = new Socket("localhost", EchoServer.PORT);
            System.out.println("EchoClient: started");
            System.out.println("Client Socket: "+ socket);
            // creazione stream di input da socket

            out = new ObjectOutputStream((socket.getOutputStream()));
            in = new ObjectInputStream(socket.getInputStream());

            stdIn = new BufferedReader(new InputStreamReader(System.in));
            String userInput;
            // ciclo di lettura da tastiera, invio al server e stampa risposta
            while (true){
                userInput = stdIn.readLine();
                out.writeObject(userInput);
                if (userInput.equals("END")) break;
                System.out.println("Echo: " + in.readObject());
            }

        }
        catch (UnknownHostException e) {
            System.err.println("Don’t know about host ");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn’t get I/O for the connection to: ");
            System.exit(1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("EchoClient: closing...");
        out.close();
        in.close();
        stdIn.close();
        socket.close();
    }
} //EchoClient