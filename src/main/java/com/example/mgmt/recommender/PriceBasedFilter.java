package com.example.mgmt.recommender;
import org.springframework.stereotype.Component;

@Component//("PBF")
//@Primary
public class PriceBasedFilter implements Filter{
    public String[] getRecommendations(Object item){
        return new String[] {"lunch box", "water bottle"};
    }
}
