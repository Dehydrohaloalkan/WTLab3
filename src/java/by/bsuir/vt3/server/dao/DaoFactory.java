package java.by.bsuir.vt3.server.dao;

import java.by.bsuir.vt3.server.dao.Impl.ProfileDaoImpl;
import java.by.bsuir.vt3.server.dao.Impl.StudentDaoImpl;

public class DaoFactory {
    private static final DaoFactory instanse = new DaoFactory();
    private final StudentDao studentDao = new StudentDaoImpl();
    private final ProfileDao profileDao = new ProfileDaoImpl();

    private DaoFactory(){}

    public StudentDao getStudentDao() {
        return studentDao;
    }

    public ProfileDao getProfileDao() {
        return profileDao;
    }

    public static DaoFactory getInstance(){
        return instanse;
    }
}
