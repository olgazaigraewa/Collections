
import lombok.Getter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Getter
public class Recipe {
    private  final String name;
    private final double price;
    private final Map<Product,Integer> products = new HashMap<>();

    public Recipe(String name,  double price) {
        if (name == null || name.isBlank()) {
            throw new RuntimeException("Не все поля заполнены!");
        }
        this.name = name;
        this.price = price;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
