package java.by.bsuir.vt3.server.service;

import java.by.bsuir.vt3.server.service.Impl.ServerServiceImpl;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();
    private final ServerService serverService = new ServerServiceImpl();

    private ServiceFactory() {}

    public ServerService getServerService() {
        return serverService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }
}
