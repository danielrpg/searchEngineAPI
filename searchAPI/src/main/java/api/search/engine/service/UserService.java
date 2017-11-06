package api.search.engine.service;

import api.search.engine.model.User;

import java.util.List;
import java.util.Map;

/**
 * @author dany
 */

public interface UserService {
    List<User> listUser();
    Map<String, Object> deleteUserById(String id);
    Map<String, Object> authenticateUser(User user);
}
