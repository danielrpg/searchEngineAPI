package api.search.engine.implementation;

import api.search.engine.model.Edict;
import api.search.engine.model.EdictDocument;
import api.search.engine.model.User;
import api.search.engine.service.FullSearchService;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dfernandez
 */
@Service("FullSearchService")
public class FullSearchImpl implements FullSearchService{

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;


    @Override
    public Map<String, Object> fullTextSearch(String searchText) {
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery()
                .should(
                        QueryBuilders.queryStringQuery(searchText)
                                .lenient(true)
                                .field("titleEdict")
                ).should(QueryBuilders.queryStringQuery(searchText)
                        .lenient(true)
                        .field("contextEdict"));
        NativeSearchQuery build = new NativeSearchQueryBuilder()
                .withQuery(queryBuilder)
                .build();
        List<EdictDocument> editResult = elasticsearchTemplate.queryForList(build, EdictDocument.class);
        Map<String, Object> resultEditList = new HashMap<>();
        resultEditList.put("edicts", editResult);
        return resultEditList;
    }
}
