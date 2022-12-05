package java.by.bsuir.vt3.beans;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@XmlRootElement(name="profiles")
@XmlAccessorType(XmlAccessType.FIELD)
public class Profiles{
    @XmlElements({
            @XmlElement(name="profile",type = Profile.class),
    })
    private List<Profile> profiles;
}
