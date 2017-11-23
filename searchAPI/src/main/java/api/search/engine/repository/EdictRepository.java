package api.search.engine.repository;

import api.search.engine.model.Edict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author dfernandez
 * @date 11/19/2017.
 */
@Repository
public interface EdictRepository extends JpaRepository<Edict, Long>{
}
