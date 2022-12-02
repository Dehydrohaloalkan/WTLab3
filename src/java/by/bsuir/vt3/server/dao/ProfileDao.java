package java.by.bsuir.vt3.server.dao;

import java.by.bsuir.vt3.beans.AccountType;
import java.by.bsuir.vt3.beans.Profile;
import java.util.List;

public interface ProfileDao {

    List<Profile> getAll();
    String login(String username, String password);
    AccountType getAccountType(String authToken);
    void logout(String authToken);
}
