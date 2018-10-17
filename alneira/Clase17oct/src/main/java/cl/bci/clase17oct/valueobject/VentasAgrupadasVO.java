package cl.bci.clase17oct.valueobject;

public class VentasAgrupadasVO {

    public VentasAgrupadasVO(){

    }

    public VentasAgrupadasVO(String name, Long amount){
        this.name = name;
        this.amount = amount;
    }

    private String name;
    private Long amount;

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
