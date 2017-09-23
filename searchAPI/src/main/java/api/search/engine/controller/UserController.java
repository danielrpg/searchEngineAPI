package api.search.engine.controller;

import api.search.engine.model.User;
import api.search.engine.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dany
 */
@RestController
@RequestMapping(value = "/rest/search")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/name/{text}")
    public @ResponseBody List<User> searchName(@PathVariable final String text) {
        return userRepository.findByName(text);
    }


    @GetMapping(value = "/salary/{salary}")
    public List<User> searchSalary(@PathVariable final Long salary) {
        return userRepository.findBySalary(salary);
    }


    @GetMapping(value = "/all")
    public List<User> searchAll() {
        List<User> usersList = new ArrayList<>();
        Iterable<User> userses = userRepository.findAll();
        userses.forEach(usersList::add);
        return usersList;
    }

}
