package api.search.engine.controller;

import api.search.engine.service.IndexationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author dfernandez
 * @date 11/18/2017.
 */
@RestController
@RequestMapping(value = "/api/rest/v1")
public class IndexationController {

    @Autowired
    private IndexationService indexationService;

    @GetMapping(value = "/indexDatabase")
    public @ResponseBody
    Map<String, Object> indexDatabase(){
        indexationService.indexationDatabaseToElasticsearch();
        return null;
    }

}
