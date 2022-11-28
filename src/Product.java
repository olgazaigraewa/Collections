
import lombok.Getter;
import lombok.Setter;
import java.util.Objects;

@Getter
@Setter
public class Product {
    private  String name;
    private  int cost;

    private boolean isBuy;

    public Product(String name, int cost) {
        if (name == null || name.isEmpty() || name.isBlank() || cost <= 0)
            throw new IllegalArgumentException("Заполните карточку товара полностью!");
        this.name = name;
        this.cost = cost;

    }

    public void buy() {
        isBuy = true;
    }
    public boolean isBuy(){
        return isBuy;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + ": цена - " + cost +  " рублей.";
    }



}











