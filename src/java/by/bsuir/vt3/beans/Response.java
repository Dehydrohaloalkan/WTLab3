package java.by.bsuir.vt3.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response implements Serializable {
    private ResponseType responseType;
    private RequestType requestType;
    private String responseMessage;
    private String[] params;
    private Student[] students;
}
