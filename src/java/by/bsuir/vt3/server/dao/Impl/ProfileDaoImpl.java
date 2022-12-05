package java.by.bsuir.vt3.server.dao.Impl;

import jakarta.xml.bind.JAXBContext;

import java.by.bsuir.vt3.beans.AccountType;
import java.by.bsuir.vt3.beans.Profile;
import java.by.bsuir.vt3.beans.Profiles;
import java.by.bsuir.vt3.server.dao.ProfileDao;
import java.io.FileReader;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProfileDaoImpl implements ProfileDao {

    private final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvwxyz";
    private final SecureRandom rand = new SecureRandom();
    private List<Profile> profiles;
    private final Map<String, Profile> loggedUsers = new HashMap<String, Profile>();

    @Override
    public List<Profile> getAll() {
        if(profiles == null) {
            try {
                JAXBContext context = JAXBContext.newInstance(Profiles.class);
                Profiles unmarshalledEntity = ((Profiles) context.createUnmarshaller().
                        unmarshal(new FileReader("./src/resources/profiles_db.xml")));
                profiles = unmarshalledEntity.getProfiles();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return profiles;
    }

    @Override
    public String login(String username, String password) {
        if(profiles == null) {
            this.getAll();
        }
        for(Profile profile : profiles) {
            if(profile.getUsername().equals(username) &&
                    profile.getPassword().equals(password)) {
                String authToken = rand.ints(8, 0, chars.length()).
                        mapToObj(i -> "" + chars.charAt(i)).collect(Collectors.joining());
                loggedUsers.put(authToken, profile);
                return authToken;
            }
        }
        return null;
    }

    @Override
    public AccountType getAccountType(String authToken) {
        try {
            if(loggedUsers.containsKey(authToken)) {
                return loggedUsers.get(authToken).getAccountType();
            }
        } catch(NullPointerException e) {
            return null;
        }
        return null;
    }

    @Override
    public void logout(String authToken) {
        loggedUsers.remove(authToken);
    }
}
