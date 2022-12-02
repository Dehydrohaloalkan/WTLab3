package java.by.bsuir.vt3.client.main;

import java.by.bsuir.vt3.beans.Response;
import java.by.bsuir.vt3.client.controller.ClientController;
import java.by.bsuir.vt3.client.controller.impl.ClientControllerImpl;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client extends Thread {
    private Socket sock;
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;
    private int port;
    private ClientController clientController;

    @Override
    public void run() {
        try {
            this.setPort(1111);
            sock = new Socket("localhost", port);
            outputStream = new ObjectOutputStream(sock.getOutputStream());
            inputStream = new ObjectInputStream(sock.getInputStream());
            clientController = new ClientControllerImpl();
            while(true) {
                outputStream.writeObject(clientController.createRequest());
                clientController.processResponse((Response)inputStream.readObject());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
