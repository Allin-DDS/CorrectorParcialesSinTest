package ar.edu.utn.frba.dds.correccionParciales.CorreccionesDeParciales;


public class RespuestaAlumno  {
	int numero;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public TipoDePregunta getRespuesta() {
		return respuesta;
	}
	public void setRespuesta(TipoDePregunta respuesta) {
		this.respuesta = respuesta;
	}
	TipoDePregunta respuesta;
	
	public RespuestaAlumno(int numero, TipoDePregunta respuesta){
		this.numero = numero;
		this.respuesta = respuesta;
	}
}
