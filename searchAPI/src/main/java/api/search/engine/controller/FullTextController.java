package api.search.engine.controller;

import api.search.engine.service.FullSearchService;
import api.search.engine.utility.RequestQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author dfernandez
 */
@RestController
@RequestMapping(value = "/api/rest/v1")
public class FullTextController {

    @Autowired
    private FullSearchService fullSearchService;

    @PostMapping("/searchFullText")
    public @ResponseBody
    Map<String, Object> fullTextSearch(@RequestBody RequestQuery requestQuery){
        return fullSearchService.fullTextSearch(requestQuery.getQuery());
    }
}
