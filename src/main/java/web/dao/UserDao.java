package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void addCarInList(User user);

    List<User> getCarFromListByCount(int count);
}
