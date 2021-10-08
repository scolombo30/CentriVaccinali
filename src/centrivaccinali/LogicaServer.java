package centrivaccinali;

import java.io.*;
import java.net.Socket;

public class LogicaServer implements Runnable{
    Socket socket;
    //reader e writer li uso per scrivere le operazioni
    private BufferedReader is;
    private PrintWriter os;
    //obj input e output stream li uso per comunicare tra i socket gli oggetti cittani e centri vaccinali(implementano serializable)
    private ObjectInputStream ois;
    private ObjectOutputStream oos;

    //fare connessione al db ;


    public LogicaServer(Socket _socket){
        //inizializzo variabili
        socket=_socket;
        try{
        is= new BufferedReader(new InputStreamReader(socket.getInputStream()));
        os= new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
        ois= new ObjectInputStream(socket.getInputStream());
        oos= new ObjectOutputStream(socket.getOutputStream());
        }
        catch (IOException e) {}
    }

    public void run() {
        try {
            while (!socket.isClosed()) {
                //leggere dal socket quello che mi manda il client e fare di conseguenza
                //implementare logica del server
                System.out.println("Client collegato");
                System.out.println("Client chiuso");
                socket.close();
               //controllo se il messaggio inviato sul socket è "client chiuso" e chiudo il socket
                //if(messaggio.equals("Client chiuso")) socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
