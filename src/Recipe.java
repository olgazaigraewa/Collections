
import lombok.Getter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static javax.swing.UIManager.put;

@Getter
public class Recipe {
    private  final String name;

    private final Map<Product,Integer> products = new HashMap<>();

    public Recipe(String name) {
        if (name == null || name.isBlank()) {
            throw new RuntimeException("Не все поля заполнены!");
        }
        this.name = name;

    }
    public void add(String product, int count){
        if (count<=0){
            count=1;
        }
        if (this.products.containsKey(product)){
            put(product, this.products.get(product)+ count);
        }else {
           put(product, count);
        }
    }
    public  double makeRecipePrice(){
        double sum=1 ;
        for (Map.Entry<Product,Integer>product:this.products.entrySet()){
            sum+=product.getKey().getCost()*product.getValue();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o==null|| getClass()!= o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
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
