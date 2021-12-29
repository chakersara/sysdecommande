package com.systemdecommande.systemdecommande.repo;

import com.systemdecommande.systemdecommande.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
}