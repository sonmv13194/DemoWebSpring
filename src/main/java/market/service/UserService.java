package market.service;

import market.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
