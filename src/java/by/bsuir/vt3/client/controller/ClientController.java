package java.by.bsuir.vt3.client.controller;

import java.by.bsuir.vt3.beans.Request;
import java.by.bsuir.vt3.beans.Response;

public interface ClientController {
    Request createRequest();
    void processResponse(Response response);
}
