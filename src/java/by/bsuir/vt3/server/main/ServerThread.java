package java.by.bsuir.vt3.server.main;

import java.by.bsuir.vt3.beans.Request;
import java.by.bsuir.vt3.beans.Response;
import java.by.bsuir.vt3.server.controller.ControllerFactory;
import java.by.bsuir.vt3.server.controller.ServerController;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;
    private Socket sock;

    public ServerThread(Socket sock) throws IOException {
        outputStream = new ObjectOutputStream(sock.getOutputStream());
        inputStream = new ObjectInputStream(sock.getInputStream());
        this.sock = sock;
    }

    @Override
    public void run() {
        ServerController serverController = ControllerFactory.getInstance().
                getServerController();
        try {
            while(true) {
                Request request = (Request)inputStream.readObject();
                Response response =	serverController.action(request);
                outputStream.writeObject(response);
            }
        } catch(IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                sock.close();
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
