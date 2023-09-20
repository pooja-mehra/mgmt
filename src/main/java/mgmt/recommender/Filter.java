package mgmt.recommender;

import java.util.HashMap;

public interface Filter {
    public String[] getRecommendations(Object item);
}
