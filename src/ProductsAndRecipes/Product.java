package ProductsAndRecipes;

import java.util.Objects;
import Validate.*;
public class Product {
    private final String name;
    private final Integer priсe;
    private  Integer amount;
    public Product(String name,Integer priсe, Integer amount){
        this.name = Validate.validateString(name);
        this.priсe = Validate.validateInteger(priсe);
        this.amount = Validate.validateInteger(amount);
    }

    public Integer getPriсe() {
        return priсe;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = Validate.validateInteger(amount);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name == product.name && Objects.equals(name, product.name) && Objects.equals(priсe, product.priсe) && Objects.equals(amount, product.amount) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "ProductsAndRecipes.Product{" +
                "name='" + name + '\'' +
                ", priсe=" + priсe +
                ", amount=" + amount +
                '}';
    }
}
