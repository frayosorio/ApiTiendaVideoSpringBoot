package tiendavideo.apitiendavideo.modelo;

import javax.persistence.*;

@Entity
@Table(name = "tercero")
public class Tercero {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

}
