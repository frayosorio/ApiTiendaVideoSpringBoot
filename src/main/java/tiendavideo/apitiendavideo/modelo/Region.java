package tiendavideo.apitiendavideo.modelo;

import javax.persistence.*;

@Entity
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "region", length = 100)
    private String region;

    @ManyToOne
    @JoinColumn(name = "idpais", referencedColumnName = "id")
    private Pais pais;

    @Column(name = "codigo", nullable = true, length = 5)
    private String codigo;

    public Region() {
    }

    public long getId() {
        return id;
    }

    public Region(long id, String region, Pais pais, String codigo) {
        this.id = id;
        this.region = region;
        this.pais = pais;
        this.codigo = codigo;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}