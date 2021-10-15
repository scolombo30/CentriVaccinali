package cittadini;

// EchoClient.java
import java.net.*;
import java.io.*;
public class EchoClient {
    public static void main(String[] args) throws IOException {
 ;
        Socket socket=null;
        BufferedReader in=null, stdIn=null;
        PrintWriter out=null;
        try {
            // creazione socket
            socket = new Socket("192.168.137.1", EchoServer.PORT);
            System.out.println("EchoClient: started");
            System.out.println("Client Socket: "+ socket);
            // creazione stream di input da socket
            InputStreamReader isr = new InputStreamReader( socket.getInputStream());
            in = new BufferedReader(isr);
            // creazione stream di output su socket
            OutputStreamWriter osw = new OutputStreamWriter( socket.getOutputStream());
            BufferedWriter bw = new BufferedWriter(osw);
            out = new PrintWriter(bw, true);
            // creazione stream di input da tastiera
            stdIn = new BufferedReader(new InputStreamReader(System.in));
            String userInput;
            // ciclo di lettura da tastiera, invio al server e stampa risposta
            while (true){
                userInput = stdIn.readLine();
                out.println(userInput);
                if (userInput.equals("END")) break;
                System.out.println("Echo: " + in.readLine());
            }
        }
        catch (UnknownHostException e) {
            System.err.println("Don’t know about host ");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn’t get I/O for the connection to: ");
            System.exit(1);
        }
        System.out.println("EchoClient: closing...");
        out.close();
        in.close();
        stdIn.close();
        socket.close();
    }
} //EchoClient