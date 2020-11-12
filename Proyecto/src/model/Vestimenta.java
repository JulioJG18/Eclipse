package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vestimenta database table.
 * 
 */
@Entity
@Table(name="vestimenta")
@NamedQuery(name="Vestimenta.findAll", query="SELECT v FROM Vestimenta v")
public class Vestimenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=50)
	private String descripcion;

	@Column(nullable=false)
	private float precio;

	@Column(nullable=false)
	private int tela;

	public Vestimenta() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getTela() {
		return this.tela;
	}

	public void setTela(int tela) {
		this.tela = tela;
	}

}