package cl.mruizg;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("calculadoraBean")
@SessionScoped
public class CalculadoraBean implements Serializable {

    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int resultado;

    public void sumar() {
        setResultado(getN1() + getN2() + getN3() + getN4());
    }

    public void restar() {
        setResultado(getN1() - getN2() - getN3() - getN4());
    }

    public void dividir() {
        setResultado(getN1() / getN2() / getN3() / getN4());
    }

    public void multiplicar() {
        setResultado(getN1() * getN2() * getN3() * getN4());
    }

    /**
     * @return the n1
     */
    public int getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(int n1) {
        this.n1 = n1;
    }

    /**
     * @return the n2
     */
    public int getN2() {
        return n2;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(int n2) {
        this.n2 = n2;
    }

    /**
     * @return the n3
     */
    public int getN3() {
        return n3;
    }

    /**
     * @param n3 the n3 to set
     */
    public void setN3(int n3) {
        this.n3 = n3;
    }

    /**
     * @return the n4
     */
    public int getN4() {
        return n4;
    }

    /**
     * @param n4 the n4 to set
     */
    public void setN4(int n4) {
        this.n4 = n4;
    }

    /**
     * @return the resultado
     */
    public int getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }


}
