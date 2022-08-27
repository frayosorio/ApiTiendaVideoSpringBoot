package tiendavideo.apitiendavideo.modelo;

import javax.persistence.*;

@Entity
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "idregion", referencedColumnName = "id")
    private Region region;

    @Column(name = "ciudad", nullable = true, length = 100)
    private String ciudad;

    public Ciudad() {
    }

    public Ciudad(long id, Region region, String ciudad) {
        this.id = id;
        this.region = region;
        this.ciudad = ciudad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}