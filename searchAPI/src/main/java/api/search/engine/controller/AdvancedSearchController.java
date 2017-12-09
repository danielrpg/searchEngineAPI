package api.search.engine.controller;

import api.search.engine.service.AdvancedSearchService;
import api.search.engine.utility.AdvancedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author dfernandez
 * @date 12/3/2017.
 */
@RestController
@RequestMapping(value = "/api/rest/v1")
public class AdvancedSearchController {

    @Autowired
    private AdvancedSearchService advancedSearchService;

    @RequestMapping(value = "/searchAdvancedSearch")
    public @ResponseBody
    Map<String, Object> searchAdvanced(@RequestBody AdvancedQuery advancedQuery){
        return advancedSearchService.advancedSearch(advancedQuery);
    }
}
