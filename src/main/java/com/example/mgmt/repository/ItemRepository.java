package com.example.mgmt.repository;
import com.example.mgmt.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Object> {

    List<Item> findByCategory(String category);
    List<Item> findById(int id);
    List<Item> findByPriceGreaterThan(double price);
    List<Item> findByNameContainingIgnoreCase(String name);

}
