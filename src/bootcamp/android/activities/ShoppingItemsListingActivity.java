package bootcamp.android.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;
import bootcamp.android.GridViewCustomAdapter;
import bootcamp.android.R;
import bootcamp.android.models.Product;
import bootcamp.android.repositories.ProductRepository;

import java.util.List;

public class ShoppingItemsListingActivity extends Activity {

    private ProductRepository productRepository;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        productRepository = new ProductRepository();
//        LinearLayout layout = (LinearLayout) findViewById(R.id.listofitems);
        final List<Product> products  = productRepository.getProducts();
//        LayoutInflater layoutInflater = getLayoutInflater();
//        for (Product product : products) {
//            View view = layoutInflater.inflate(R.layout.product, null);
//            TextView titleView = (TextView)view.findViewById(R.id.title);
//            titleView.setText(product.getTitle());
//            TextView descriptionView = (TextView)view.findViewById(R.id.description);
//            descriptionView.setText(product.getDescription());
//            layout.addView(view);
//        }

//        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,productRepository.getProductsTitle());
        GridViewCustomAdapter arrayAdapter = new GridViewCustomAdapter(this,products);
        GridView gridView = (GridView) findViewById(R.id.grid_view);
        gridView.setAdapter(arrayAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getApplicationContext(), ProductDescription.class);
                intent.putExtra("result",products.get(position).getDescription());
                startActivity(intent);

            }
        });


    }




}
