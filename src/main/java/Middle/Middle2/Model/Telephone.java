package Middle.Middle2.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column
    String name;

    @Column
    String number;

    public Telephone(String ownersName, String numberOfPhone) {
        this.name = ownersName;
        this.number = numberOfPhone;
    }

    public Telephone() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}