package tiendavideo.apitiendavideo.servicio;

import java.util.List;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tiendavideo.apitiendavideo.modelo.*;
import tiendavideo.apitiendavideo.repositorio.*;

@Service
public class EmpresaServicioImplementacion implements EmpresaServicio {

    @Autowired
    private EmpresaRepositorio repositorio;

    @PersistenceContext
    public EntityManager em;

    public List<Empresa> listar() {
        return repositorio.findAll();
    }

    public Empresa obtener(Long id) {
        return repositorio.findById(id).get();
    }

    public List<Empresa> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

    public List<Titulo> buscarTitulos(String nombre) {

        List<Titulo> titulos = em.createStoredProcedureQuery("fBuscarTitulosPorEmpresa", Titulo.class)
                .registerStoredProcedureParameter("nombreEmpresa", String.class, ParameterMode.IN)
                .setParameter("nombreEmpresa", nombre)
                .getResultList();

        return titulos;
    }

    public Empresa guardar(Empresa empresa) {
        return repositorio.save(empresa);
    }

    public boolean eliminar(Long id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
