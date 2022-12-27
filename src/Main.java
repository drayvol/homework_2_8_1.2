import ProductsAndRecipes.Product;
import ProductsAndRecipes.ProductList;
import ProductsAndRecipes.Recipe;
import ProductsAndRecipes.RecipesList;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Product banana = new Product("банан", 200, 3);
        Product apple = new Product("яблоко", 100, 1);
        Product tomato = new Product("помидоры", 80, 1);
        Product cucumber = new Product("огурец", 50, 2);
        ProductList products1 = new ProductList();
        products1.add(banana,apple,tomato);
        ProductList product2 = new ProductList();
        product2.add(apple, cucumber,tomato, banana);
        Recipe olivie = new Recipe("Оливье", products1);
        Recipe salat = new Recipe("Салат", product2);
        RecipesList recipes = new RecipesList();
        recipes.add(olivie, salat);

        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        while(numbers.size()<20){
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        numbers.removeIf(number ->number % 2 == 1);
        System.out.println(numbers);

    }
}