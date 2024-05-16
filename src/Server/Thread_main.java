package Server;


import java.io.*;
import java.net.Socket;

public class Thread_main {
    private Socket socket;
    private Server_main server_main;
    String message;

    public Thread_main(Socket socket, Server_main server_main) {
        this.socket = socket;
        this.server_main = server_main;
    }

    public void doIT(){
            Thread in = new Thread(new Runnable() {
            @Override
            public void run() {
                BufferedReader in_socket = null;
                PrintWriter out_socket = null;
                try {
                    while (true) {
                        in_socket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        message = in_socket.readLine();
                        if (message != null) {
                            for (Socket socket:server_main.getSockets()) {
                                out_socket = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
                                out_socket.println(message);
                                System.out.println("Klijent : " + message);
                            }
                        }
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
            });
            Thread out = new Thread(new Runnable() {
            @Override
            public void run() {
                PrintWriter out_socket = null;
                try { while (true){
                    if(message != null){
                    System.out.println("Klijent : " + message);
                    for(Socket socket : server_main.getSockets()){
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        bw.write(message);
                        bw.flush();
                    }
                    }
                }} catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            });
            in.start();
            out.start();
        }
    }
