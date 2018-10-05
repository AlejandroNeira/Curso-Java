package cl.bci.clase5oct2.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
public class Taxi {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTaxi;

    @Column(name = "patente", length = 8)
    private String patente;

    @Column(name = "conductor", length = 255)
    private String conductor;

    public int getIdTaxi() {
        return idTaxi;
    }

    public void setIdTaxi(int idTaxi) {
        this.idTaxi = idTaxi;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
}
