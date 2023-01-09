package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User find(long id);
    void save(User user);
    void update(User user);
    void delete(long id);
}
