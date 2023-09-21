package com.example.mgmt.recommender;
import com.example.mgmt.model.Item;
import org.springframework.stereotype.Component;
import java.lang.String;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component//("CBF")
public class CategoryBasedFilter implements Filter {
    public CategoryBasedFilter() {
        super();
        logger.info("In CategoryBasedFilter constructor method");
    }
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    //@Autowired
    private Item item;

    public Item getItem(){
        return item;
    }

    @PostConstruct
    private void postConstruct() {
        //load movies into cache
        logger.info("In ContentBasedFilter postConstruct method");
    }
    @PreDestroy
    public void preDestroy() {
        //cleanup code
        logger.info("In ContentBasedFilter preDestroy method");
    }
    public String[] getRecommendations(Object item){
        return new String[] {"book", "pen", "notebook"};
    }
}
