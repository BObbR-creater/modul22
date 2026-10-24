package Middle.Middle2.Service;

import Middle.Middle2.Model.Telephone;

import java.util.List;
import java.util.Optional;

public interface TelephoneService {

    List<Telephone> getAllTelephone();

    Optional<Telephone> getTelephoneById(Long id);

    List<Telephone> getTelephoneByName(String name);

    Telephone saveNewTelephone (Telephone telephone);

    void deleteTelephoneById(Long id);

}
