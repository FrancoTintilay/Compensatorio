package ar.edu.unju.edm.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
@Component
@Entity
public class Habitacion implements Serializable {

	/**
 * 
 */
	private static final long serialVersionUID= 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native", strategy="native")
	private long id;
	@Column
	private String tipo;
	@Column
	private Integer numhab;
	@Column
	private String descripcion;
	@Column
	private String disponibilidad;
	@Column
	private Integer precio;
	public Habitacion() {
		
	}
	public Habitacion(long id, String tipo, Integer numhab, String descripcion, String disponibilidad, Integer precio) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.numhab = numhab;
		this.descripcion = descripcion;
		this.disponibilidad = disponibilidad;
		this.precio = precio;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getNumhab() {
		return numhab;
	}
	public void setNumhab(Integer numhab) {
		this.numhab = numhab;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}