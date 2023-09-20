package mgmt.recommender;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component//("PBF")
//@Primary
public class PriceBasedFilter implements Filter{
    public String[] getRecommendations(Object item){
        return new String[] {"lunch box", "water bottle"};
    }
}
