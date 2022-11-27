import java.util.*;

public class Main {
    public static Map<String,Integer>map = new HashMap<>();
    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();
        set.add(new Product("рис", 100, 2));
        set.add(new Product("мясо", 700, 5));
        set.add(new Product("морковь", 50, 5));
        set.add(new Product("лук", 40, 5));
        set.add(new Product("масло", 150, 1));
        set.add(new Product("соль", 25, 1));
        set.add(new Product("помидоры", 300, 2));
        set.add(new Product("сыр", 1300, 1));
        set.add(new Product("хлеб", 200, 1));
        set.add(new Product("мандарины", 200, 3));

        System.out.println(set);
        for (Product product : set) {
            System.out.println(product);
        }






    }
}


