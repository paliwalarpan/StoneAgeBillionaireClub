/*
package com.rest.dao;

import java.util.List;

//import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rest.domain.Billionaires;
import com.rest.domain.BillionairesMapper;

@Repository
public class BillionairesDaoImpl implements BillionairesDao {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	//@PostConstruct
	private void postConstruct() {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public List<Billionaires> getBillionaires() {
		List<Billionaires> billionaires = null;

		billionaires = jdbcTemplate.query("SELECT * FROM BILLIONAIRES;", new BillionairesMapper());
		return billionaires;
	}

	public Billionaires getBillionaire(Long billionaireiD) {
		Billionaires billionaires = null;
		return billionaires;

	}

	public int deleteBillionaire(Long billionaireiD) {
		System.out.println("deleteing user-" + billionaireiD);
		int deleted = jdbcTemplate.update("delete from billionaires where id = ?", billionaireiD);
		return deleted;
	}

	public Billionaires updateBillionaire(Billionaires billionaires) {
		return jdbcTemplate.update("update billionaires set first_name = ?, last_name = ?, career  = ? where id = ?",
				billionaires.getFirstName(), billionaires.getLastName(), billionaires.getCareer(),
				billionaires.getId()) > 0;
	}

	public int createBillionaires(Billionaires billionaires) {
		int save = jdbcTemplate.update("insert into billionaires(first_name, last_name, career) values(?,?,?);",
				billionaires.getFirstName(), billionaires.getLastName(), billionaires.getCareer());
		return save;
	}

}*/
