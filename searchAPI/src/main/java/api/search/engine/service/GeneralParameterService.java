package api.search.engine.service;

import api.search.engine.model.GeneralParameter;

import java.util.List;

/**
 * @author dfernandez
 * @date 11/19/2017.
 */
public interface GeneralParameterService {
    String finGeneralParameterByCode(String codeParam);

    List<GeneralParameter> finDepartamentByCode(Integer codeParamGRP);
}
