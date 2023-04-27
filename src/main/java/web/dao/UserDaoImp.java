package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    private EntityManager entityManager;
    @Override
    public void saveUser(String name, String lastName, String email) {

    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void removeUser(long id) {

    }

    @Override
    public void editUser(long id) {

    }
}
