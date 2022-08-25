package tiendavideo.apitiendavideo.modelo;

import javax.persistence.*;

@Entity
@Table(name = "inventario")
public class Inventario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}
