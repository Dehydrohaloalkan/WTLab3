package java.by.bsuir.vt3.beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Request implements Serializable {
    private RequestType requestType;
    private String authToken;
    private String[] params;
    private Student student;

    public Request() {
        this.requestType = null;
        this.authToken = null;
        this.params = null;
        this.student = null;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String[] getParams() {
        return params;
    }

    public void setParams(String[] params) {
        this.params = params;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
