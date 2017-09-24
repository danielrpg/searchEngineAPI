package api.search.engine.controller;

import api.search.engine.model.Persona;
import api.search.engine.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dany
 */
@RestController
@RequestMapping("/rest/persona")
public class PersonController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/searchPersona/{text}")
    public List<Persona> searchPersonByText(@PathVariable("text") final String text){
        return personaService.searchPersonByText(text);
    }

}
