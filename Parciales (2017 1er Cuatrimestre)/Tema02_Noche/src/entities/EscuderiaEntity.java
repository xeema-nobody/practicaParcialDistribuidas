package entities;

import view.EscuderiaView;

public class EscuderiaEntity {

	private Integer numero;
	private String descripcion;
	
	public EscuderiaEntity(Integer numero, String descripcion) {
		this.numero = numero;
		this.descripcion = descripcion;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public EscuderiaView toView(){
		return new EscuderiaView(numero, descripcion);
	}
	
}
