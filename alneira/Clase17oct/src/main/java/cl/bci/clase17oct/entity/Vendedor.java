package cl.bci.clase17oct.entity;

import javax.persistence.*;

@Entity
public class Vendedor {

    @Id
    @Column(name = "id_vendedor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVendedor;

    private String name;

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
