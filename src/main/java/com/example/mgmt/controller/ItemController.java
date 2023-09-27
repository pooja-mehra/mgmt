package com.example.mgmt.controller;
import com.example.mgmt.model.Item;
import com.example.mgmt.repository.ItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("Item")
public class ItemController {
    private final ItemRepository repository;
    public ItemController(ItemRepository repository){
        this.repository = repository;
    }

    @GetMapping("/")
    public Iterable<Item> getItems() {
        return repository.findAll();
    }
    @GetMapping("{category}")
    public List<Item> getItemsByCategory(@PathVariable String category) {
        return repository.findByCategory(category);//.orElseThrow(StudentNotFoundException::new);
    }
    @GetMapping("{id}")
    public List<Item> getItemsById(@PathVariable int id) {
        return repository.findById(id);//.orElseThrow(StudentNotFoundException::new);
    }
    @GetMapping({"price"})
    public List<Item> getItemsByPrice(@PathVariable double price) {
        return repository.findByPriceGreaterThan(price);//.orElseThrow(StudentNotFoundException::new);
    }
    @GetMapping("{name}")
    public List<Item> findItemsByName(@PathVariable String name) {
        return repository.findItemsByNameContainingIgnoreCase(name);//.orElseThrow(StudentNotFoundException::new);
    }
}
