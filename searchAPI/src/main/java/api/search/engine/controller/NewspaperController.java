package api.search.engine.controller;

import api.search.engine.service.NewspaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
public class NewspaperController {

    @Autowired
    private NewspaperService newspaperService;

    @GetMapping(value = "/getListNewspapers")
    public @ResponseBody
    Map<String, Object> getListNewspapers(){
        return newspaperService.getListNewspapers();
    }
}
