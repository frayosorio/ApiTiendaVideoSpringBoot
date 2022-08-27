package tiendavideo.apitiendavideo.modelo;

import javax.persistence.*;

@Entity
public class Pais {
    @Id
    private long id;

    @Column(name = "pais", length = 100, unique = true)
    private String pais;

    @Column(name = "codigoalfa2", nullable = true, length = 5)
    private String codigoalfa2;

    @Column(name = "codigoalfa3", nullable = true, length = 5)
    private String codigoalfa3;

    public Pais() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigoalfa2() {
        return codigoalfa2;
    }

    public void setCodigoalfa2(String codigoalfa2) {
        this.codigoalfa2 = codigoalfa2;
    }

    public String getCodigoalfa3() {
        return codigoalfa3;
    }

    public void setCodigoalfa3(String codigoalfa3) {
        this.codigoalfa3 = codigoalfa3;
    }

}
