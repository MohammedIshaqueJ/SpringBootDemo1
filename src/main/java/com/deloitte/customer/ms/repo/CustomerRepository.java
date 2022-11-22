package com.deloitte.customer.ms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.customer.ms.entity.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Integer>{

}
