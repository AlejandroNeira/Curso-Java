package cl.bci.clase19oct.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FruitType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFruitType;

    private String name;

}
