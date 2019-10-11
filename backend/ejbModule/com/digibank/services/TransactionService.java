package com.digibank.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.digibank.codes.DigibankCodes;
import com.digibank.entities.Transaction;
import com.digibank.interfaces.ITransactions;

@Stateless
@LocalBean
public class TransactionService implements ITransactions  {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public String saveTransactions(Transaction transction) {
		
		if(transction != null) {
			em.persist(transction);
			return DigibankCodes.SUCCESS;
		}
		return DigibankCodes.UNSUCCESS;
	}

}
