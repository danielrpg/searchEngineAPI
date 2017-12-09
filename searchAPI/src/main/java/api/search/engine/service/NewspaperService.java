package api.search.engine.service;

import java.util.Map;

/**
 * @author dfernandez
 * @date 11/19/2017.
 */
public interface NewspaperService {
    String findNewspaperById(Integer idNewspaper);

    Map<String, Object> getListNewspapers();
}
