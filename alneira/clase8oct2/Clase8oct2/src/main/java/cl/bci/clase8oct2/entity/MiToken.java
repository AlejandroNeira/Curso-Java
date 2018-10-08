package cl.bci.clase8oct2.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class MiToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idToken;

    private String codigo;

    public MiToken(){

    }

    public MiToken(Date date, User user){
        this.fecha = date;
        this.user = user;
    }


    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "idUser")
    private User user;

    public int getIdToken() {
        return idToken;
    }

    public void setIdToken(int idToken) {
        this.idToken = idToken;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
