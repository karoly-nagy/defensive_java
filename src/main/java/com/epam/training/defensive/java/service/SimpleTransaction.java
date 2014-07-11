package com.epam.training.defensive.java.service;

import java.math.BigDecimal;
import java.util.Date;

import net.sf.oval.constraint.DateRange;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotNegative;
import net.sf.oval.constraint.NotNull;
import net.sf.oval.guard.Guarded;

import com.epam.training.defensive.java.interfaces.Transaction;

@Guarded
public class SimpleTransaction implements Transaction {

	@Override
	@NotNull
	public String add(
			@NotNull @NotNegative BigDecimal amount, 
			@NotNull @Length(min = 10, max = 10) String account, 
			@NotNull @DateRange(min = "tomorrow") Date transactionDate) {
		return account + new Date().getTime();
	}

	@Override
	public String withdraw(BigDecimal amount, String account,
			Date transactionDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String transfer(BigDecimal amount, String accountFrom,
			String accountTo, Date transactioDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
