package tiendavideo.apitiendavideo.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tiendavideo.apitiendavideo.modelo.Ciudad;

@Repository
public interface CiudadRepositorio extends JpaRepository<Ciudad, Long> {

    @Query("SELECT c FROM Ciudad c WHERE c.ciudad LIKE '%'||?1||'%'")
    List<Ciudad> buscar(String nombre);
    
}
