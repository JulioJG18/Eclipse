package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tela database table.
 * 
 */
@Entity
@Table(name="tela")
@NamedQuery(name="Tela.findAll", query="SELECT t FROM Tela t")
public class Tela implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false)
	private int cantidad;

	@Column(nullable=false, length=50)
	private String descripcion;

	public Tela() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}