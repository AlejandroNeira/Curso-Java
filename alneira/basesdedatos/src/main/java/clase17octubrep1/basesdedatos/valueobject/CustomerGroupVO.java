package clase17octubrep1.basesdedatos.valueobject;

// VO = Value Object (o objeto valioso)
// Tambien se puede llamar DTO Data Transfer Object

public class CustomerGroupVO {

    private String name;
    private Long amount;

    public CustomerGroupVO() {
    }

    public CustomerGroupVO(String name, Long amount) {
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
