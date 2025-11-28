package Interface;

import Model.Computadoras;

public interface Metodos {
	
	// utilizando el HAS Map<key value)
	
	public void guardar(Computadoras computadora);
	
	public void mostrar();
	
	public Computadoras buscar(String marca);
	
	public void editar(Computadoras computadora);
	
	public void eliminar(String marca);
	

}
