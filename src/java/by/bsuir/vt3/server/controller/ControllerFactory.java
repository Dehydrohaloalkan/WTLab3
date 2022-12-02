package java.by.bsuir.vt3.server.controller;

import java.by.bsuir.vt3.server.controller.Impl.ServerControllerImpl;

public class ControllerFactory {
    private static final ControllerFactory instance = new ControllerFactory();
    private final ServerController serverController = new ServerControllerImpl();

    private ControllerFactory() {}

    public ServerController getServerController() {
        return serverController;
    }

    public static ControllerFactory getInstance() {
        return instance;
    }
}
