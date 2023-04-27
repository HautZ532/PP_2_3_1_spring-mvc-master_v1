package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(String name, String lastName, String email);
    List<User> getAllUsers();
    void removeUser(long id);
    void editUser(long id);

}
