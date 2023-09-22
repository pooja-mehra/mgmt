package com.example.mgmt;
import com.example.mgmt.model.Item;
import com.example.mgmt.repository.ItemRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication(scanBasePackages = {"com.example.mgmt.*"})
@EntityScan(basePackages = {"com.example.mgmt.model"})
public class MgmtApplication implements ApplicationListener<ContextRefreshedEvent> {
    private final ItemRepository repository;
    public MgmtApplication(ItemRepository repository){
        this.repository = repository;
    }
    public static void main(String[] args) {
        //ApplicationContext manages the beans and dependencies
        ApplicationContext appContext =
        SpringApplication.run(MgmtApplication.class, args);
    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        /*Item item = new Item();
        item.setName("pen");
        item.setId(1);
        item.setCategory("school supplies");
        item.setPrice(10.00);
        repository.save(item);*/
    }

}
