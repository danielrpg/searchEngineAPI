package api.search.engine.implementation;

import api.search.engine.model.User;
import api.search.engine.repository.UserRepository;
import api.search.engine.service.UserService;
import api.search.engine.utility.Response;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author dany
 */
@Service("UserService")
public class UserImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public List<User> listUser() {
        List<User> usersList = new ArrayList<>();
        Iterable<User> userses = userRepository.findAll();
        userses.forEach(usersList::add);
        return usersList;
    }

    @Override
    public Map<String, Object> deleteUserById(String id) {
        userRepository.delete(id);
        Response response = new Response();
        response.setMessage("El usuario has sido eliminado");
        response.setSuccess(Boolean.TRUE);
        Map<String, Object> result = new HashMap<>();
        result.put("response", response);
        return result;
    }

    @Override
    public Map<String, Object> authenticateUser(User user) {
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery()
                .should(
                        QueryBuilders.queryStringQuery(user.getUserName())
                                .lenient(true)
                                .field("userName")
                ).should(QueryBuilders.queryStringQuery(user.getPassword())
                        .lenient(true)
                        .field("password"));
        NativeSearchQuery build = new NativeSearchQueryBuilder()
                .withQuery(queryBuilder)
                .build();
        List<User> userResult = elasticsearchTemplate.queryForList(build, User.class);

        if(null != userResult){

        }
        return null;
    }
}
