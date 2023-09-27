package com.example.mgmt.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import com.example.mgmt.model.Item;
import org.springframework.stereotype.Repository;

@Repository
public class ItemsRepository {
    private final EntityManager entityManager;

    public ItemsRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Item> findItemsByName(String name) {
        // Replace non-word characters with '%' in the name
        String modifiedName = name.replaceAll("\\W", "%");

        String jpqlQuery = "SELECT i FROM Item i WHERE i.name LIKE :itemName";

        Query query = entityManager.createQuery(jpqlQuery);
        query.setParameter("itemName", "%" + modifiedName + "%");

        return query.getResultList();
    }
}

