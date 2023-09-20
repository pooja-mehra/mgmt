package mgmt.recommender;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class RecommendationController {
    @GetMapping("/")
    public List<Item> getAllItems() {
        return Arrays.asList(new Item(1, "pen case", "school supplies",7.50),
                new Item(2, "printer", "office supplies",160.40),
                new Item(3, "Shark Tales", "books",6.00) );
    }
}
