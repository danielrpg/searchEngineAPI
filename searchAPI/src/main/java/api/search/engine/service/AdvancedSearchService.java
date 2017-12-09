package api.search.engine.service;

import api.search.engine.utility.AdvancedQuery;

import java.util.Map;

/**
 * @author dfernandez
 * @date 12/3/2017.
 */
public interface AdvancedSearchService {

    Map<String, Object> advancedSearch(AdvancedQuery searchText);
}
