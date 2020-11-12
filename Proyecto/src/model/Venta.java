package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the venta database table.
 * 
 */
@Entity
@Table(name="venta")
@NamedQuery(name="Venta.findAll", query="SELECT v FROM Venta v")
public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false)
	private int cantidad;

	@Column(nullable=false)
	private int tela;

	@Column(nullable=false)
	private int vestimenta;

	public Venta() {
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

	public int getVestimenta() {
		return this.vestimenta;
	}

	public void setVestimenta(int vestimenta) {
		this.vestimenta = vestimenta;
	}

}