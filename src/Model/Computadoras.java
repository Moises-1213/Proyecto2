package Model;

import java.time.LocalDate;

public class Computadoras {
	// Atributos
	private String marca;
	private LocalDate fechaRegistro;
	private float precio;
	private boolean estatus;
	
	
	//Constructor con parametros
	public Computadoras(String marca, LocalDate fechaRegistro, float precio, boolean estatus) {
		super();
		this.marca = marca;
		this.fechaRegistro = fechaRegistro;
		this.precio = precio;
		this.estatus = estatus;
	}


	//metodos to String convierte  un objeto a cadena

	@Override
	public String toString() {
		return "Computadoras [marca=" + marca + ", fechaRegistro=" + fechaRegistro + ", precio=" + precio + ", estatus="
				+ estatus + "]";
	}


	// Encapsulamiento metodos get y set

	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}



	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}



	public float getPrecio() {
		return precio;
	}



	public void setPrecio(float precio) {
		this.precio = precio;
	}



	public boolean isEstatus() {
		return estatus;
	}



	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	

	
}
