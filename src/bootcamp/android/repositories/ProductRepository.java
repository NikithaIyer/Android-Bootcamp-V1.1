package bootcamp.android.repositories;

import bootcamp.android.R;
import bootcamp.android.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("TITLE1","DESC1", R.drawable.ic_launcher));
        products.add(new Product("TITLE2","DESC2", R.drawable.ic_launcher));
        products.add(new Product("TITLE3","DESC3", R.drawable.ic_launcher));
        return products;
    }
    public List<String> getProductsTitle() {
        List<Product> productsList = getProducts();
        List<String> stringList = new ArrayList<String>();
        for (Product product : productsList){

        stringList.add(product.toString());
        }
        return stringList;
    }
}
