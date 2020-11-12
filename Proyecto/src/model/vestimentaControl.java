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

public class vestimentaControl implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Vestimenta vestimenta;
	
	vestimentaControl(){
		vestimenta = new Vestimenta();
	}
	
	@PersistenceContext(unitName = "Proyecto")
	private EntityManager em;    

	@Resource
	private UserTransaction userTransaction;

	public Vestimenta getVestimenta() {
		return vestimenta;
	}

	public void setVestimenta(Vestimenta vestimenta) {
		this.vestimenta = vestimenta;
	}
	
	public void guardar() throws Exception  {
	    userTransaction.begin();
	    em.persist(vestimenta);
	    userTransaction.commit();
	}

}