package web.service;

import web.model.User;
import java.util.List;

public interface UserService {
    void addCarInList(User user);
    List<User> getCarFromListByCount(int count);
}
