import java.util.*;

public class Main {
    public static Map<String,Integer>map = new HashMap<>();
    public static void main(String[] args) {

        Product rice = new Product("рис", 100);
        Product meat = new Product("мясо", 700);
        Product carrot = new Product("морковь", 50);
        Product onion = new Product("лук", 40);
        Product oil = new Product("масло", 150);
        Product salt = new Product("соль", 25);
        Product tomato = new Product("помидоры", 300);
        Product cheese = new Product("сыр", 1300);
        Product bread = new Product("хлеб", 100);
        Product mandarins = new Product("мандарины", 200);
        Product greenery = new Product("зелень", 250);
        ProductService service = new ProductService();
        service.add(rice);
        service.add(meat);
        service.add(carrot);
        service.add(onion);
        service.add(oil);
        service.add(salt);
        service.add(tomato);
        service.add(cheese);
        service.add(bread);
        service.add(mandarins);
        service.add(greenery);
        System.out.println(service);

        service.delete(mandarins);


        Set<Product> set = new HashSet<>();
        set.add(new Product("рис", 100));
        set.add(new Product("мясо", 700));
        set.add(new Product("морковь", 50));
        set.add(new Product("лук", 40));
        set.add(new Product("масло", 150));
        set.add(new Product("соль", 25));
        set.add(new Product("помидоры", 300));
        set.add(new Product("сыр", 1300));
        set.add(new Product("хлеб", 200));
        set.add(new Product("мандарины", 200));
        set.add(new Product("зелень", 250));

        System.out.println(set);
        for (Product product : set) {
            System.out.println(product);
        }


        Recipe pilaf = new Recipe("Плов" );
        pilaf.add("рис", 1);
        pilaf.add("мясо", 1);
        pilaf.add("морковь", 3);
        pilaf.add("лук", 1);
        pilaf.add("масло", 1);
        pilaf.add("соль", 1);
        System.out.println("Стоимость блюда - " + pilaf + " - " + pilaf.makeRecipePrice() +" рублей");
        System.out.println(" ");

        Recipe salad = new Recipe("Салат греческий");
        salad.add("помидоры", 2);
        salad.add("сыр", 1);
        salad.add("зелень", 1);
        salad.add("лук", 1);
        salad.add("масло", 1);
        salad.add("соль", 1);
        System.out.println("Стоимость блюда - " + salad + " - " + salad.makeRecipePrice() +" рублей");

    }
}


