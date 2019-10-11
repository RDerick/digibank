package com.transactionsController;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import com.digibank.services.TransactionService;
import com.transactionDto.TransactionDTO;

@ManagedBean(name="transactionsController")
@SessionScoped
public class TransactionsController {

	@ManagedProperty(value ="#{transactionDto}")
	TransactionDTO transactionDto = new TransactionDTO();
	
	@EJB
	TransactionService transactionService;
	
	public String addNewTransaction(TransactionDTO transactionDto) {
		return transactionService.saveTransactions(transactionDto.getTransactions());
	}

	public TransactionDTO getTransactionDto() {
		return transactionDto;
	}

	public void setTransactionDto(TransactionDTO transactionDto) {
		this.transactionDto = transactionDto;
	}
	
	
}
