package java.by.bsuir.vt3.beans;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement(name="profile")
@XmlAccessorType(XmlAccessType.FIELD)
public class Profile {
    @XmlElement
    private String username;
    @XmlElement
    private String password;
    @XmlElement
    private AccountType accountType;
}
