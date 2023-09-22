package com.example.mgmt.model;
import jakarta.persistence.*;

import java.util.Objects;

//@Component @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Entity
public class Item {
    @Id
    private int id;
    private String name;
    private String category;
    private double price;

    public Item(){

    }
    public Item(int id, String name, String category, double price){
        super();
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Movie [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Double.compare(price, item.price) == 0 && Objects.equals(name, item.name) && Objects.equals(category, item.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category, price);
    }
}
