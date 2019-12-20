package ua.uanetwork.chat.server;

import java.io.IOException;
import java.net.ServerSocket;

public class ChatServer {

    public static void main(String[] args) {
        new ChatServer();


    }
    private ChatServer(){
        System.out.println("Server running...");
        try(ServerSocket serverSocket = new ServerSocket(8189)) {
            while (true)
        }catch (IOException e ) {
            throw new RuntimeException(e);
        }
    }
}
