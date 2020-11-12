package model;

import java.io.Serializable;

import javax.annotation.Resource;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;

@Named
@SessionScoped

public class compracontrol implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Compra compra;
	
	compracontrol(){
		compra = new Compra();
	}
	
	@PersistenceContext(unitName = "Proyecto")
	private EntityManager em;    

	@Resource
	private UserTransaction userTransaction;

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	
	public void guardar() throws Exception  {
	    userTransaction.begin();
	    em.persist(compra);
	    userTransaction.commit();
	}

}