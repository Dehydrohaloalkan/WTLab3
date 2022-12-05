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
public class Request implements Serializable {
    private RequestType requestType;
    private String authToken;
    private String[] params;
    private Student student;
}
