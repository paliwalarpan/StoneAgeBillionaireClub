package com.rest.service;

import com.rest.dao.BillionaireSpringDataJpaRepository;
import com.rest.domain.Billionaires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillionairesServiceImpl implements BillionairesService {

	@Autowired
    private BillionaireSpringDataJpaRepository billionairesJPADao;

	public List<Billionaires> listAll() {
        return (List<Billionaires>) billionairesJPADao.findAll();
	}

	@Override
	public int deleteBillionaire(Long bilionaireiD) {
        billionairesJPADao.delete(bilionaireiD);
        return 1;
	}

	@Override
	public int createBillionaires(Billionaires billionaires) {
        return Integer.parseInt(billionairesJPADao.save(billionaires).getId().toString());
	}

	@Override
	public Billionaires updateBillionaire(Billionaires billionaires) {
        return billionairesJPADao.save(billionaires);
	}

	@Override
	public Billionaires getBillionaire(Long bilionaireiD) {
        return billionairesJPADao.getOne(bilionaireiD);
	}
}
