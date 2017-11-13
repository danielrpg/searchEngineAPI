package api.search.engine.service;

import api.search.engine.model.User;
import api.search.engine.utility.Response;

import java.util.List;
import java.util.Map;

/**
 * @author dany
 */

public interface UserService {
    List<User> listUser();
    Map<String, Object> deleteUserById(String id);
    Response authenticateUser(User user);
}
