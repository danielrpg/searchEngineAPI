package api.search.engine.implementation;

import api.search.engine.model.GeneralParameter;
import api.search.engine.repository.GeneralParameterRepository;
import api.search.engine.service.GeneralParameterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dfernandez
 * @date 11/19/2017.
 */
@Service("GeneralParameterService")
public class GeneralParameterImpl implements GeneralParameterService {

    @Autowired
    private GeneralParameterRepository generalParameterRepository;

    @Override
    public String finGeneralParameterByCode(String codeParam) {
        List<GeneralParameter> generalParams = generalParameterRepository.finGeneralParameterByCode(codeParam);
        return generalParams.get(0).getGralParamDescription();
    }
}
