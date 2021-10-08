package centrivaccinali;

import java.io.IOException;
import java.net.Socket;

public class ClientProva {
    public static void main(String[] args)  {
       try{
           Socket socket=new Socket("localhost",2812);
           System.out.println("Collegato al server");
       }catch (IOException e) {System.err.println("Impossibile collegarsi al server. "+ e.getMessage());}

    }

}
