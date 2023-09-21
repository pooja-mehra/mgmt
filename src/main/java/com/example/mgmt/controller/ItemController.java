package com.example.mgmt.controller;
import com.example.mgmt.model.Item;
import com.example.mgmt.repository.ItemRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("Item")
public class ItemController {
    private final ItemRepository repository;
    public ItemController(ItemRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public Iterable<Item> getStudents() {
        return repository.findAll();
    }
    @PostMapping("/create")
    public Item createItem() {
        // ...
        Item item = new Item(2, "printer", "office supplies",160.40);
        item.setId(1);
        item.setName("pen");
        item.setCategory("school supplies");
        item.setPrice(8.00);
        return item;
    }
}
