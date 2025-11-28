package Implementacion;

import java.util.HashMap;

import org.xml.sax.HandlerBase;

import Interface.Metodos;
import Model.Computadoras;

public class LogicaMetodos implements Metodos {
	
	//Los tipos de datos primitivos se deben parsear
	private HashMap<String, Computadoras> hashMap = new HashMap<String, Computadoras>();
	

	@Override
	public void guardar(Computadoras computadora) {
		// TODO Auto-generated method stub
		hashMap.put(computadora.getMarca(), computadora);
		
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		if(hashMap.size() > 0)
			System.out.println(hashMap);
		else
			System.out.println("No hay registros");
		
		
	}

	@Override
	public Computadoras buscar(String marca) {
		// TODO Auto-generated method stub
		
		return hashMap.get(marca);
	}

	@Override
	public void editar(Computadoras computadora) {
		// TODO Auto-generated method stub
		hashMap.put(computadora.getMarca(), computadora);
		
	}

	@Override
	public void eliminar(String marca) {
		// TODO Auto-generated method stub
		hashMap.remove(marca);
		
	}

}
