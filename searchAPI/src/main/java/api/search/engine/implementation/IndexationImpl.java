package api.search.engine.implementation;

import api.search.engine.model.Edict;
import api.search.engine.model.EdictDocument;
import api.search.engine.repository.EdictDocumentRepository;
import api.search.engine.repository.EdictRepository;
import api.search.engine.service.GeneralParameterService;
import api.search.engine.service.IndexationService;
import api.search.engine.service.NewspaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dfernandez
 * @date 11/19/2017.
 */
@Service("IndexationService")
public class IndexationImpl implements IndexationService{

    @Autowired
    private EdictRepository edictRepository;

    @Autowired
    private NewspaperService newspaperService;

    @Autowired
    private GeneralParameterService generalParameterService;

    @Autowired
    private EdictDocumentRepository edictDocumentRepository;

    @Override
    public void indexationDatabaseToElasticsearch() {
        List<Edict> edictRsult =  edictRepository.findAll();
        for (Edict edict: edictRsult) {
            EdictDocument edictDocument = new EdictDocument();
            edictDocument.setCodeEdict(edict.getCodeEdict());
            edictDocument.setTitleEdict(edict.getTitleEdict());
            edictDocument.setDateEdict(edict.getDateEdict());
            edictDocument.setContextEdict(edict.getContextEdict());
            edictDocument.setTypeEdict(edict.getTypeEdict());
            edictDocument.setNumFaceEdict(edict.getNumFaceEdict());
            edictDocument.setFileEdict(edict.getFileEdict());
            edictDocument.setNewspaperEdict(newspaperService.findNewspaperById(edict.getIdNewspaper()));
            String[] strings = edict.getCodeEdict().split("/");
            String[] codes = strings[1].split("-");
            edictDocument.setDepartamentEdict(generalParameterService.finGeneralParameterByCode(codes[0]));
            edictDocument.setActiveEdict(1);
            edictDocumentRepository.save(edictDocument);
        }
    }
}
