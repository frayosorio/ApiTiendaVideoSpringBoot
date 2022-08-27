package tiendavideo.apitiendavideo.modelo;

import javax.persistence.*;

@Entity
@Table(name = "titulo")
public class Titulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "año")
    private long año;

    @ManyToOne
    @JoinColumn(name = "idempresa", referencedColumnName = "id")
    private Empresa empresa;

    @Column(name = "precio")
    private double precio;

    @Column(name = "productor", nullable = true, length = 100)
    private String productor;

    @Column(name = "nombre", length = 100, unique = true)
    private String nombre;

    @Column(name = "director", nullable = true, length = 100)
    private String director;

    @Column(name = "protagonistas", nullable = true, length = 1000)
    private String protagonistas;

    public Titulo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAño() {
        return año;
    }

    public void setAño(long año) {
        this.año = año;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setIdempresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProtagonistas() {
        return protagonistas;
    }

    public void setProtagonistas(String protagonistas) {
        this.protagonistas = protagonistas;
    }

}