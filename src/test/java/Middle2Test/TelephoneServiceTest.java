package Middle2Test;


import Middle.Middle2.Model.Telephone;
import Middle.Middle2.Repository.TelephoneRepoJpa;
import Middle.Middle2.Service.TelephoneServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TelephoneServiceTest {

    @Mock
    TelephoneRepoJpa repo;

    @InjectMocks
    TelephoneServiceImpl service;

    List<Telephone> existsTelephone = List.of(new Telephone("Иван", "123"));

    @Test
    public void FindAllTest() {
        when(repo.findAll()).thenReturn(existsTelephone);
        List<Telephone> allTelephone = service.getAllTelephone();
        assertEquals(existsTelephone, allTelephone);

        verify(repo).findAll();
        verifyNoMoreInteractions(repo);
    }

    @Test
    public void testFindByName() {
        when(repo.findByName("Misha")).thenReturn(existsTelephone);
        List<Telephone> foundNumbers = service.getTelephoneByName("Misha");
        assertEquals(existsTelephone, foundNumbers);

        verify(repo).findByName("Misha");
        verifyNoMoreInteractions(repo);
    }

    @Test
    public void testExceptions() {
        Telephone telephone = new Telephone("", "900");
        assertThrows(RuntimeException.class, () -> service.saveNewTelephone(telephone));
        verifyNoMoreInteractions(repo);
    }


}
