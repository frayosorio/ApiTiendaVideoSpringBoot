package tiendavideo.apitiendavideo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tiendavideo.apitiendavideo.modelo.*;
import tiendavideo.apitiendavideo.servicio.*;

@RestController
@RequestMapping("/empresas")
public class EmpresaControlador {

    @Autowired
    private EmpresaServicio servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Empresa> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Empresa obtener(@PathVariable long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{nombre}", method = RequestMethod.GET)
    public List<Empresa> buscar(@PathVariable String nombre) {
        return servicio.buscar(nombre);
    }

    @RequestMapping(value = "/{nombre}/buscarjuegos", method = RequestMethod.GET)
    public List<Titulo> buscarJuegos(@PathVariable String nombre) {
        return servicio.buscarTitulos(nombre);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Empresa crear(@RequestBody Empresa empresa) {
        return servicio.guardar(empresa);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Empresa actualizar(@RequestBody Empresa empresa) {
        return servicio.guardar(empresa);
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
    public boolean eliminar(@PathVariable long id) {
        return servicio.eliminar(id);
    }

}
