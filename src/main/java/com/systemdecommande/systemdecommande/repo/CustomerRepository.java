package com.systemdecommande.systemdecommande.repo;

import com.systemdecommande.systemdecommande.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}