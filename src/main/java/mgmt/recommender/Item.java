package mgmt.recommender;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ScopedProxyMode;

@Component @Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Item {

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

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "Movie [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
    }
}
