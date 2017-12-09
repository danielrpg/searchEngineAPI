package api.search.engine.implementation;

import api.search.engine.model.EdictDocument;
import api.search.engine.service.AdvancedSearchService;
import api.search.engine.utility.AdvancedQuery;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author dfernandez
 * @date 12/3/2017.
 */
@Service("AdvancedSearchService")
public class AdvancedSearchImpl implements AdvancedSearchService{

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public Map<String, Object> advancedSearch(AdvancedQuery advancedQuery) {
        BoolQueryBuilder queryBuilder = QueryBuilders.boolQuery()
                .should(
                        QueryBuilders.queryStringQuery(advancedQuery.getNameQuery())
                                .lenient(true)
                                .field("contextEdict")
                ).should(QueryBuilders.queryStringQuery(advancedQuery.getCiQuery())
                        .lenient(true)
                        .field("contextEdict")
                ).should(QueryBuilders.queryStringQuery(advancedQuery.getDepartamentQuery())
                        .lenient(true)
                        .field("contextEdict")
                ).should(QueryBuilders.queryStringQuery(advancedQuery.getNewspaperQuery())
                        .lenient(true)
                        .field("contextEdict")
                ).should(QueryBuilders.queryStringQuery(advancedQuery.getAddressQuery())
                        .lenient(true)
                        .field("contextEdict")
                );
        NativeSearchQuery build = new NativeSearchQueryBuilder()
                .withQuery(queryBuilder)
                .build();
        List<EdictDocument> editResult = elasticsearchTemplate.queryForList(build, EdictDocument.class);
        Map<String, Object> resultEditList = new HashMap<>();
        resultEditList.put("edicts", editResult);
        return resultEditList;
    }
}
