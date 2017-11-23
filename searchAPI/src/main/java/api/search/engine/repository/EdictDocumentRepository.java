package api.search.engine.repository;

import api.search.engine.model.EdictDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dfernandez
 * @date 11/15/2017.
 */
@Repository
public interface EdictDocumentRepository extends ElasticsearchRepository<EdictDocument, String> {
}
