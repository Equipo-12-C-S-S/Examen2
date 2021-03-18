/*******************************************************************************
 * 2021, All rights reserved.
 *******************************************************************************/
package Musico.ito.poo;
import java.time.LocalDate;
public class intrumento {
	public intrumento(String nombre, String tipo, int antiguedad, String musico, LocalDate fecha) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.antiguedad = antiguedad;
		this.musico = musico;
		this.fecha = fecha;
	}
	private String nombre = "";
	private String tipo = "";
	private int antiguedad = 0;
	private String musico = "";
	private java.time.LocalDate fecha = null;
	
	public intrumento() {
		// Start of user code constructor for intrumento)
		super();
	}
	public void agregarMusicoFecha(String musico, java.time.LocalDate fecha) {
		this.fecha=LocalDate.now();
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String newTipo) {
		this.tipo = newTipo;
	}
	public int getAntiguedad() {
		return this.antiguedad;
	}
	public void setAntiguedad(int newAntiguedad) {
		this.antiguedad = newAntiguedad;
	}
	public String getMusico() {
		return this.musico;
	}
	public void setMusico(String newMusico) {
		this.musico = newMusico;
	}
	public java.time.LocalDate getFecha() {
		return this.fecha;
	}
	public void setFecha(java.time.LocalDate newFecha) {
		this.fecha = newFecha;
	}
	@Override
	public String toString() {
		return "intrumento [nombre=" + nombre + ", tipo=" + tipo + ", antiguedad=" + antiguedad + ", musico=" + musico
				+ ", fecha=" + fecha + "]";
	}

}
