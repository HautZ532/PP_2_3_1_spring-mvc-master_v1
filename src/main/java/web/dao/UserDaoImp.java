package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserDaoImp implements UserDao {

    private final List<User> listUser = new ArrayList<>();

    @Override
    public void addCarInList(User user) {
        listUser.add(user);
    }

    @Override
    public List<User> getCarFromListByCount(int count) {
        if (count >= 5) return listUser;
        return listUser.stream().limit(count).collect(Collectors.toList());
    }
}
