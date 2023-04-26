package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDaoImp;
import web.model.User;
import java.util.List;

@Service
public class UserServiceImp implements UserService {
    private final UserDaoImp car = new UserDaoImp();

    @Transactional
    @Override
    public void addCarInList(User user) {
        this.car.addCarInList(user);
    }

    @Override
    public List<User> getCarFromListByCount(int count) {
        return car.getCarFromListByCount(count);
    }
}
