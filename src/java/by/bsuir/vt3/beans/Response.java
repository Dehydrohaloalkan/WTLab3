package java.by.bsuir.vt3.beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Response implements Serializable {
    private ResponseType responseType;
    private RequestType requestType;
    private String responseMessage;
    private String[] params;
    private Student[] students;

    public Response() {
        this.responseType = null;
        this.requestType = null;
        this.responseMessage = null;
        this.params = null;
        this.students = null;
    }

    public ResponseType getResponseType() {
        return responseType;
    }

    public void setResponseType(ResponseType responseType) {
        this.responseType = responseType;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
