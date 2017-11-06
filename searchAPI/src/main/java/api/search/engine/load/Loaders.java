package api.search.engine.load;

import api.search.engine.model.Persona;
import api.search.engine.model.User;
import api.search.engine.repository.PersonaRepository;
import api.search.engine.repository.UserRepository;
import api.search.engine.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @author dany
 */
@Component
public class Loaders {

    @Autowired
    ElasticsearchOperations operations;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PersonaRepository personaRepository;

    @PostConstruct
    @Transactional
    public void loadAll(){
        operations.putMapping(User.class);
        System.out.println("Loading Data");
      //  userRepository.save(getData());
       // personaRepository.save(getPersonData());
        System.out.println("Loading Completed");
    }

    private List<User> getData(){
        List<User> userList = new ArrayList<>();
     //   userList.add(new User("daniel.fernandezgp@gmail.com", ".daniel123", "Daniel", "Fernandez"));
     //   userList.add(new User("daniel.fernandez@gmail.com", "daniel23", "Daniel", "Fernandez"));
        return userList;
    }

    private List<Persona> getPersonData(){
        List<Persona> personaList = new ArrayList<>();

        personaList.add(new Persona(1L, "Daniel", "Fernandez", "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500"));
        personaList.add(new Persona(2L, "juan", "Fernandez", "Es un hecho establecido hace demasiado tiempo que un lector se distraerá con el contenido del texto de un sitio mientras que mira su diseño."));
        personaList.add(new Persona(3L, "Ariel", "Fernandez", "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500"));
        personaList.add(new Persona(4L, "Juan", "Fernandez", "Es un hecho establecido hace demasiado tiempo que un lector se distraerá con el contenido del texto de un sitio mientras que mira su diseño."));
        personaList.add(new Persona(5L, "Pedro", "Fernandez", "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500"));
        personaList.add(new Persona(6L, "Gonzalo", "Fernandez", "Hay muchas variaciones de los pasajes de Lorem Ipsum disponibles, pero la mayoría sufrió alteraciones en alguna manera, ya sea porque se le agregó humor, o palabras aleatorias que no parecen ni un poco creíbles"));
        personaList.add(new Persona(7L, "Timoteo", "Fernandez", "El trozo de texto estándar de Lorem Ipsum usado desde el año 1500 es reproducido debajo para aquellos interesados."));

        return personaList;
    }
}
