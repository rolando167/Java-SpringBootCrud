package com.api.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.h2.entity.Customer;

public interface ICustomerRepo  extends JpaRepository<Customer, Long> {

}
