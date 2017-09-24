package api.search.engine.implementation;

import api.search.engine.model.Persona;
import api.search.engine.service.PersonaService;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dany
 */
@Service(value = "personaservice")
public class PersonaImpl implements PersonaService{

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public List<Persona> searchPersonByText(final String text) {
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery()
                .should(
                    QueryBuilders.queryStringQuery(text)
                        .lenient(true)
                        .field("name")
                        .field("lastName")
                        .field("description")
                ).should(QueryBuilders.queryStringQuery("*"+text+"*")
                        .lenient(true)
                        .field("name")
                        .field("lastName")
                        .field("description"));
        NativeSearchQuery build = new NativeSearchQueryBuilder()
                .withQuery(queryBuilder)
                .build();
        List<Persona> userResult = elasticsearchTemplate.queryForList(build, Persona.class);
        return userResult;
    }
}
