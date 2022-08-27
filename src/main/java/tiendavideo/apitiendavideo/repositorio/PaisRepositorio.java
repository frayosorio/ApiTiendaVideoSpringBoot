package tiendavideo.apitiendavideo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tiendavideo.apitiendavideo.modelo.Pais;

@Repository
public interface PaisRepositorio extends JpaRepository<Pais, Long> {
    
}
