package tiendavideo.apitiendavideo.modelo;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "inventario")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "idtitulo", referencedColumnName = "id")
    private Titulo titulo;

    @Column(name = "consecutivo")
    private long consecutivo;

    @ManyToOne
    @JoinColumn(name = "idtecnologia", referencedColumnName = "id")
    private Tecnologia tecnologia;

    @Column(name = "fechaadquisicion", nullable = true)
    private Date fechaAdquisicion;

    @Column(name = "activo")
    private boolean activo;

    public Inventario() {
    }

    public Inventario(long id, Titulo titulo, long consecutivo, Tecnologia tecnologia, Date fechaAdquisicion,
            boolean activo) {
        this.id = id;
        this.titulo = titulo;
        this.consecutivo = consecutivo;
        this.tecnologia = tecnologia;
        this.fechaAdquisicion = fechaAdquisicion;
        this.activo = activo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public void setTitulo(Titulo titulo) {
        this.titulo = titulo;
    }

    public long getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Tecnologia getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Tecnologia tecnologia) {
        this.tecnologia = tecnologia;
    }

    public Date getFechaadquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaadquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
