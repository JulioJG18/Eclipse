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

public class telacontrol implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Tela tela;
	
	telacontrol(){
		tela = new Tela();
	}
	
	@PersistenceContext(unitName = "Proyecto")
	private EntityManager em;    

	@Resource
	private UserTransaction userTransaction;

	public Tela getTela() {
		return tela;
	}

	public void setTela(Tela tela) {
		this.tela = tela;
	}
	
	public void guardar() throws Exception  {
	    userTransaction.begin();
	    em.persist(tela);
	    userTransaction.commit();
	}

}