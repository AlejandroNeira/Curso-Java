package cl.bci.clase17oct.entity;

import javax.persistence.*;

@Entity
@NamedQuery(name = "listarclientes", query = "select c from Client c order by c.name")
public class Client {

    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;

    private String name;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

}
