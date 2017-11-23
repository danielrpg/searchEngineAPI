package api.search.engine.repository;

import api.search.engine.model.Newspaper;
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
public interface NewspaperRepository extends JpaRepository<Newspaper, Long> {

    @Query("select n from newspaper n where id_newspaper=:idNewspaper")
    List<Newspaper> finNewspaperById(@Param("idNewspaper") Integer idNewspaper);
}
