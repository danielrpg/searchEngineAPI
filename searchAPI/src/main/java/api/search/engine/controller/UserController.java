package api.search.engine.controller;

import api.search.engine.model.User;
import api.search.engine.service.UserService;
import api.search.engine.utility.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author dfernandez
 */
@RestController
@RequestMapping(value = "/api/rest/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/authenticate")
    public @ResponseBody
    Response authenticate(@RequestBody User user) {
        return userService.authenticateUser(user);
    }


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<User> searchAll() {
        return userService.listUser();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public @ResponseBody Map<String, Object> deleteUserById(@PathVariable("id") String id){
        return userService.deleteUserById(id);
    }

}
