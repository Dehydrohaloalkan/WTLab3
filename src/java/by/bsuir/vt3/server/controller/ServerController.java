package java.by.bsuir.vt3.server.controller;

import java.by.bsuir.vt3.beans.Request;
import java.by.bsuir.vt3.beans.Response;

public interface ServerController {
    Response action(Request request);
}
