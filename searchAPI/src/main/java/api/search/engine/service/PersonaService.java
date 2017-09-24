package api.search.engine.service;

import api.search.engine.model.Persona;

import java.util.List;

/**
 * @author dany
 */
public interface PersonaService {

    List<Persona> searchPersonByText(final String text);
}
