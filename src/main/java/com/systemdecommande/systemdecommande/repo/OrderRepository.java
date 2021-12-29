package com.systemdecommande.systemdecommande.repo;

import com.systemdecommande.systemdecommande.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}