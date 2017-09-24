package api.search.engine.repository;

import api.search.engine.model.Persona;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author dany
 */
public interface PersonaRepository extends ElasticsearchRepository<Persona, Long>{

}
