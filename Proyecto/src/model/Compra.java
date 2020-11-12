package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the compra database table.
 * 
 */
@Entity
@Table(name="compra")
@NamedQuery(name="Compra.findAll", query="SELECT c FROM Compra c")
public class Compra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false)
	private int cantidad;

	@Column(nullable=false)
	private int tela;

	public Compra() {
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

	public int getTela() {
		return this.tela;
	}

	public void setTela(int tela) {
		this.tela = tela;
	}

}