package api.search.engine.repository;

import api.search.engine.model.GeneralParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author dfernandez
 * @date 11/19/2017.
 */
@Repository
public interface GeneralParameterRepository extends JpaRepository<GeneralParameter, Long>{

    @Query("select g from general_parameters g where gral_param_pro_sigla=:codeGeneralParam")
    List<GeneralParameter> finGeneralParameterByCode(@Param("codeGeneralParam") String codeGeneralParam);

    @Query("select g from general_parameters g where gral_param_pro_grp=:generalParamGRP")
    List<GeneralParameter> finDepartamentByCode(@Param("generalParamGRP") Integer generalParamGRP);
}
