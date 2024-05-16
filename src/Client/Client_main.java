package Client;


import Client.View.Client_view;

import java.io.*;
import java.net.Socket;


public class Client_main {
    private Encryption encryption = new Encryption();
    String message = "";
    String ClientName = "Guest";
    int proy = 420;
    Socket socket = new Socket("localhost",proy);
    BufferedReader in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    PrintWriter out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
    Client_view frame = Client_view.getInstance(this);


    public Client_main() throws IOException{
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        Thread in = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                while(true){
                    String msg = in_socket.readLine();
                    ReciveMessage(msg);
                }
                } catch (IOException e){

                }

            }
        });
        in.start();


}

    public static void main(String[] args) {
        try {
            new Client_main();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void SendMessage(String msg){
        out_socket.println(encryption.Encrypt(ClientName+": "+msg));
    }
    public void ReciveMessage(String msg){
        if (msg != null){
            frame.getjTextArea().append("\n"+encryption.Decrypt(msg));
            frame.scrollToBottom(frame.getjScrollPane());
        }
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
        frame.getChangeUsername().dispose();
        out_socket.println(encryption.Encrypt(ClientName+" has joined the chat"));
    }

    public void exit(){
        out_socket.println(encryption.Encrypt(ClientName+" has left the chat"));
        try {
            this.socket.close();
        }catch (Exception e){

        }
    }
}
