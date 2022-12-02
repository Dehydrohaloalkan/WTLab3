package java.by.bsuir.vt3.server.service.Impl;

import java.by.bsuir.vt3.beans.AccountType;
import java.by.bsuir.vt3.beans.Student;
import java.by.bsuir.vt3.server.dao.DaoFactory;
import java.by.bsuir.vt3.server.service.ServerService;
import java.util.List;

public class ServerServiceImpl implements ServerService {
    @Override
    public String login(String username, String password) {
        return DaoFactory.getInstance().getProfileDao().login(username, password);
    }

    @Override
    public AccountType getAccountType(String authToken) {
        return DaoFactory.getInstance().getProfileDao().getAccountType(authToken);
    }

    @Override
    public void logout(String authToken) {
        DaoFactory.getInstance().getProfileDao().logout(authToken);
    }

    @Override
    public List<Student> getAll() {
        return DaoFactory.getInstance().getStudentDao().getAll();
    }

    @Override
    public Student get(int id) {
        return DaoFactory.getInstance().getStudentDao().get(id);
    }

    @Override
    public boolean add(Student student) {
        return DaoFactory.getInstance().getStudentDao().add(student);
    }

    @Override
    public boolean edit(Student changedStudent) {
        return DaoFactory.getInstance().getStudentDao().edit(changedStudent);
    }
}
