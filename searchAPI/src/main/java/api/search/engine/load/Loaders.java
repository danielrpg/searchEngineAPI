package api.search.engine.load;

import api.search.engine.model.User;
import api.search.engine.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dany
 */
@Component
public class Loaders {

    @Autowired
    ElasticsearchOperations operations;

    @Autowired
    UserRepository userRepository;

    @PostConstruct
    @Transactional
    public void loadAll(){
        operations.putMapping(User.class);
        System.out.println("Loading Data");
        userRepository.save(getData());
        System.out.println("Loading Completed");
    }

    private List<User> getData(){
        List<User> userList = new ArrayList<>();
        userList.add(new User("Daniel", 1252L, "Demo", 1051L));
        userList.add(new User("Juan", 1253L, "Demo2", 1052L));
        userList.add(new User("Ariel", 1254L, "Demo3", 1053L));
        userList.add(new User("Juaquin", 1255L, "Demo4", 1054L));
        userList.add(new User("Demetrio", 1256L, "Demo5", 1055L));
        return userList;
    }
}
