package tiendavideo.apitiendavideo.servicio;

import java.util.List;

import tiendavideo.apitiendavideo.modelo.*;



public interface EmpresaServicio {

	public List<Empresa> listar();
	
	public Empresa obtener(Long id);

    public List<Empresa> buscar(String nombre);

    public List<Titulo> buscarTitulos(String nombre);

	public Empresa guardar(Empresa empresa);

	public boolean eliminar(Long id);

}