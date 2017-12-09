package api.search.engine.controller;

import api.search.engine.model.GeneralParameter;
import api.search.engine.service.GeneralParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author dfernandez
 * @date 12/3/2017.
 */
@RestController
@RequestMapping(value = "/api/rest/v1")
public class GeneralParameterController {

    @Autowired
    private GeneralParameterService generalParameterService;

    @GetMapping("/getDepartamentList/{codeGrp}")
    public @ResponseBody
    List<GeneralParameter> getParameterList(@PathVariable("codeGrp") Integer codeGrp){
        return generalParameterService.finDepartamentByCode(codeGrp);
    }
}
