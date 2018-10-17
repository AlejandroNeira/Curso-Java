package clase17octubrep1.basesdedatos.valueobject;

public class SellerGroupVO {

    private String name;
    private Long amount;

    public SellerGroupVO() {
    }

    public SellerGroupVO(String name, Long amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
