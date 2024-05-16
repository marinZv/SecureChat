package Server;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server_main {
    private Socket socket;
    private String message;
    private ArrayList<Socket> sockets = new ArrayList<>();
    int proxy = 420;
    ServerSocket serverSocket = new ServerSocket(proxy);
    public Server_main()throws IOException{
        while(true){
            Socket socket = serverSocket.accept();
            if(!sockets.contains(socket))
                sockets.add(socket);
            Thread_main thread_main = new Thread_main(socket,this);
            thread_main.doIT();
        }
    }


    public static void main(String[] args) {
        try {
            new Server_main();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public ArrayList<Socket> getSockets() {
        return sockets;
    }

    public void setSockets(ArrayList<Socket> sockets) {
        this.sockets = sockets;
    }

    public void removeSocket(Socket socket){
        sockets.remove(socket);
    }
}
