package api.search.engine.repository;

import api.search.engine.model.Edict;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author dfernandez
 * @date 11/15/2017.
 */
public interface EdictRepository extends ElasticsearchRepository<Edict, String> {
}
