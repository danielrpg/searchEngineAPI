package api.search.engine.implementation;

import api.search.engine.model.Newspaper;
import api.search.engine.repository.NewspaperRepository;
import api.search.engine.service.NewspaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dfernandez
 * @date 11/19/2017.
 */
@Service("NewspaperService")
public class NewspaperImpl implements NewspaperService{

    @Autowired
    private NewspaperRepository newspaperRepository;

    @Override
    public String findNewspaperById(Integer idNewspaper) {
        List<Newspaper> newspaper = newspaperRepository.finNewspaperById(idNewspaper);
        return newspaper.get(0).getNameNewspaper();
    }
}
