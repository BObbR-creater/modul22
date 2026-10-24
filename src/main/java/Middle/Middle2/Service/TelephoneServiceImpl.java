package Middle.Middle2.Service;

import Middle.Middle2.Model.Telephone;
import Middle.Middle2.Repository.TelephoneRepoJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelephoneServiceImpl implements TelephoneService {

    @Autowired
    TelephoneRepoJpa telephoneRepoJpa;

    @Override
    public List<Telephone> getAllTelephone() {
        return telephoneRepoJpa.findAll();
    }

    @Override
    public Optional<Telephone> getTelephoneById(Long id) {
        return telephoneRepoJpa.findById(id);
    }

    @Override
    public List<Telephone> getTelephoneByName(String name) {
        return telephoneRepoJpa.findByName(name);
    }

    @Override
    public Telephone saveNewTelephone(Telephone telephone) {
        String newTelephoneName = telephone.getName();

        if (newTelephoneName == null || newTelephoneName.isBlank()) {
            throw new RuntimeException("Имя не может быть пустым!");
        }

        return telephoneRepoJpa.save(telephone);
    }

    @Override
    public void deleteTelephoneById(Long id) {
        telephoneRepoJpa.deleteById(id);
    }
}
