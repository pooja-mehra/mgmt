package mgmt.recommender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import org.springframework.beans.factory.annotation.Qualifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class RecommenderImplementation {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Filter filter;
   /* @Autowired
    //@Qualifier("CBF")
    private Filter filter;
    public RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }*/
    @Autowired
    @Qualifier("categoryBasedFilter")
    public void setFilter(Filter filter){
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }
    @PostConstruct
    public void postConstruct() {
        //initialization code goes here
        logger.info("In RecommenderImplementation postConstruct method");
    }
    @PreDestroy
    public void preDestroy() {
        //cleanup code
        logger.info("In RecommenderImplementation preDestroy method");
    }
    public String[] recommended(String name){
        System.out.println("\nName of the filter in use: " + filter + "\n");
        return filter.getRecommendations(name);
    }
}
