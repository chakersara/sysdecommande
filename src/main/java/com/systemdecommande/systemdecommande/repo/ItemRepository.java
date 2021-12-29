package com.systemdecommande.systemdecommande.repo;

import com.systemdecommande.systemdecommande.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}