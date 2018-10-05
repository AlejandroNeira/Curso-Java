package cl.bci.clase5oct2.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Actor {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idActor;

    @Column(name = "firstName", length = 50)
    private String firstName;

    @Column(name = "lastName", length = 50)
    private String lastName;

    private Date lastUpdate;
}
