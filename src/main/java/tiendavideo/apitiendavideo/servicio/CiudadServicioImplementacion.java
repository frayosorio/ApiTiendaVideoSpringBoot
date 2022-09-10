package tiendavideo.apitiendavideo.servicio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tiendavideo.apitiendavideo.modelo.Ciudad;
import tiendavideo.apitiendavideo.modelo.Tercero;
import tiendavideo.apitiendavideo.repositorio.CiudadRepositorio;

@Service
public class CiudadServicioImplementacion implements CiudadServicio {

    @Autowired
    private CiudadRepositorio repositorio;

    @PersistenceContext
    public EntityManager em;

    @Override
    public List<Ciudad> listar() {
        return repositorio.findAll();
    }

    @Override
    public Ciudad obtener(Long id) {
        return repositorio.findById(id).get();
    }

    @Override
    public List<Ciudad> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }


    @Override
    public List<Tercero> buscarClientes(String nombre) {
        List<Tercero> terceros = em.createStoredProcedureQuery("fBuscarClientesPorCiudad", Tercero.class)
                .registerStoredProcedureParameter("nombreCiudad", String.class, ParameterMode.IN)
                .setParameter("nombreCiudad", nombre)
                .getResultList();

        return terceros;
    }

    @Override
    public Ciudad guardar(Ciudad ciudad) {
        return repositorio.save(ciudad);
    }

    @Override
    public boolean eliminar(Long id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
