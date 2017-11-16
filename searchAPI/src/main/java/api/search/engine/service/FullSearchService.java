package api.search.engine.service;

import java.util.List;
import java.util.Map;

/**
 * @author dfernandez
 */
public interface FullSearchService {

    Map<String, Object> fullTextSearch(final String searchText);
}
