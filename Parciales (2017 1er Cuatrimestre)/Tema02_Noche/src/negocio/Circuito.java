package negocio;

import java.util.Date;
import view.CircuitoView;

public class Circuito {

	private Integer numero;
	private String circuito;
	private Date fechaCarrera;
	
	public Circuito(Integer numero, String circuito, Date fechaCarrera) {
		super();
		this.numero = numero;
		this.circuito = circuito;
		this.fechaCarrera = fechaCarrera;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCircuito() {
		return circuito;
	}

	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	public Date getFechaCarrera() {
		return fechaCarrera;
	}

	public void setFechaCarrera(Date fechaCarrera) {
		this.fechaCarrera = fechaCarrera;
	}
	
	public CircuitoView toView(){
		return new CircuitoView(numero, circuito, fechaCarrera.toString());
	}
}
