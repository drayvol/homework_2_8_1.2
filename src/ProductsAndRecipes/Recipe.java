package ProductsAndRecipes;

import java.util.Objects;

public class Recipe {
    private final String name;
    private ProductList productList;
    private Integer totalSum;
    public Recipe(String name, ProductList productList){
        this.name = name;
        this.productList = productList;
        this.totalSum = productList.getSum(productList);
    }

    public String getName() {
        return name;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public Integer getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(Integer totalSum) {
        this.totalSum = totalSum;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return  Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
