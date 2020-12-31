package com.rest.dao;

import com.rest.domain.Billionaires;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillionaireSpringDataJpaRepository extends JpaRepository<Billionaires, Long> {
}
