package com.rest.service;

import java.util.List;

import com.rest.domain.Billionaires;

public interface BillionairesService {
	
	public List<Billionaires> listAll() ;
	public int deleteBillionaire(Long bilionaireiD);
	public int createBillionaires(Billionaires billionaires);
	public Billionaires updateBillionaire(Billionaires billionaires);
	public Billionaires getBillionaire(Long bilionaireiD);
}
