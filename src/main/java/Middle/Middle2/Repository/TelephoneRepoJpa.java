package Middle.Middle2.Repository;

import Middle.Middle2.Model.Telephone;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TelephoneRepoJpa extends JpaRepository<Telephone, Long> {

    List<Telephone> findByNumber(String number);

    List<Telephone> findByName(String name);


}
