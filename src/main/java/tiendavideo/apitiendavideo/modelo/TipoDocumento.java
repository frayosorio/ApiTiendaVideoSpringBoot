package tiendavideo.apitiendavideo.modelo;

import javax.persistence.*;

@Entity
@Table(name = "tipodocumento")
public class TipoDocumento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name="tipo", nullable=true, length=100)
    private String tipo;
    @Column(name="ingles", nullable=true, length=50)
    private String ingles;
    @Column(name="sigla", nullable=true, length=5)
    private String sigla;

    public TipoDocumento() {}

    public TipoDocumento(long id, String tipo, String ingles, String sigla) {
        this.id = id;
        this.tipo = tipo;
        this.ingles = ingles;
        this.sigla = sigla;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getIngles() {
        return ingles;
    }
    public void setIngles(String ingles) {
        this.ingles = ingles;
    }


    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }


}