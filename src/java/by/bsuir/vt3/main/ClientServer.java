package java.by.bsuir.vt3.main;

import java.by.bsuir.vt3.client.main.Client;
import java.by.bsuir.vt3.server.main.Server;

public class ClientServer {
    public static void main(String[] args){
        Server server = new Server();
        Client client = new Client();

        server.run();
        client.run();
    }
}
