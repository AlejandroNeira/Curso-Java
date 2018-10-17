package clase17octubrep1.basesdedatos.entity;

import javax.persistence.*;

@Entity
@NamedQuery(name= "customerlist", query = "select c from Customer c order by c.name")
public class Customer {

    @Id
    @Column(name = "id")
    private int customerId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
