package clase17octubrep1.basesdedatos.entity;

import javax.persistence.*;

@Entity
@NamedQuery(name= "sellerlist", query = "select s from Seller s order by s.name")
public class Seller {


    @Id
    @Column(name = "id")
    private int sellerId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "id_sale")
    private Sale sale;

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }
}
