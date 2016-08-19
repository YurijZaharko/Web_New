package proj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import proj.entity.ListOfPropertyAndValueInteger;

/**
 * Created by SC on 10.08.2016.
 */
public interface ListOfPropertyAndValueIntegerRepository extends JpaRepository<ListOfPropertyAndValueInteger, Integer> {

}
