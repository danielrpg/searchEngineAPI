package api.search.engine.repository;


import api.search.engine.model.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author dany
 */
public interface UserRepository extends ElasticsearchRepository<User, Long> {

    List<User> findByName(String text);

    List<User> findBySalary(Long salary);
}
