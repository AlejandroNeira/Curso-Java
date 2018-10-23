package cl.bci.clase17oct.valueobject;

public class ClientAgrupadoVO {

    private String name;
    private Long amount;

    public ClientAgrupadoVO(){

    }

    public ClientAgrupadoVO(String name, Long amount){
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
