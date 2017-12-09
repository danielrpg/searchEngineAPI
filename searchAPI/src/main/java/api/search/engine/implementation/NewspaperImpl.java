package api.search.engine.implementation;

import api.search.engine.model.Newspaper;
import api.search.engine.repository.NewspaperRepository;
import api.search.engine.service.NewspaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Override
    public Map<String, Object> getListNewspapers() {
        List<Newspaper> newspaperList = newspaperRepository.findAll();
        Map<String, Object> newspapers = new HashMap<>();
        List<String> listNewspapers = new ArrayList<>();
        for (Newspaper newspaper: newspaperList) {
            listNewspapers.add(newspaper.getNameNewspaper());
        }
        newspapers.put("newspapers", listNewspapers);

        return newspapers;
    }
}
