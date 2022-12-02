package java.by.bsuir.vt3.beans;

import java.util.List;

import jakarta.xml.bind.annotation.*;

@XmlRootElement(name="profiles")
@XmlAccessorType(XmlAccessType.FIELD)
public class Profiles{
    @XmlElements({
            @XmlElement(name="profile",type = Profile.class),
    })
    private List<Profile> profiles;


    public List<Profile> getProfiles() {
        return profiles;
    }
    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }
}
