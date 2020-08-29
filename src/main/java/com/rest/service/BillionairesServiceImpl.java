package com.rest.service;

import com.rest.dao.BillionairesRepository;
import com.rest.domain.Billionaires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillionairesServiceImpl implements BillionairesService {

	@Autowired
	private BillionairesRepository billionairesJPADao;

	public List<Billionaires> listAll() {
		return (List<Billionaires>) billionairesJPADao.getBillionaires();
	}

	@Override
	public int deleteBillionaire(Long bilionaireiD) {
		Billionaires billionaire = new Billionaires(bilionaireiD);
		return billionairesJPADao.deleteBillionaire(billionaire);
	}

	@Override
	public int createBillionaires(Billionaires billionaires) {
		return billionairesJPADao.createBillionaires(billionaires);
	}

	@Override
	public Billionaires updateBillionaire(Billionaires billionaires) {
		return billionairesJPADao.updateBillionaire(billionaires);
	}

	@Override
	public Billionaires getBillionaire(Long bilionaireiD) {
		return billionairesJPADao.getBillionaire(bilionaireiD);
	}

}
