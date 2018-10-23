package cl.bci.clase19oct.entity;

import javax.persistence.*;

@Entity
public class Fruit {

    public Fruit(){
    }

    public Fruit(int idFruit, String userName, FruitType fruitType, int weight, int weightForKilo){
        this.idFruit = idFruit;
        this.userName = userName;
        this.fruitType = fruitType;
        this.weight = weight;
        this.weightForKilo = weightForKilo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFruit;
    private String userName;

    @ManyToOne
    private FruitType fruitType;
    private int weight;
    private int weightForKilo;

    public int getIdFruit() {
        return idFruit;
    }

    public Fruit setIdFruit(int idFruit) {
        this.idFruit = idFruit;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public Fruit setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public FruitType getFruitType() {
        return fruitType;
    }

    public Fruit setFruitType(FruitType fruitType) {
        this.fruitType = fruitType;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public Fruit setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public int getWeightForKilo() {
        return weightForKilo;
    }

    public void setWeightForKilo(int weightForKilo) {
        this.weightForKilo = weightForKilo;
    }
}
