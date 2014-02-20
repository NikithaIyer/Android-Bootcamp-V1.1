package bootcamp.android;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bootcamp.android.models.Product;
import bootcamp.android.repositories.ProductRepository;

import java.util.List;

public class GridViewCustomAdapter extends ArrayAdapter
{
    Context context;
    List<Product> products;


    public GridViewCustomAdapter(Context context, List<Product> products)
    {
        super(context,0,products);
        this.context=context;
        this.products=products;

    }

//    public int getCount()
//    {
//        return 24;
//    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View row = convertView;

        if (row == null)
        {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(R.layout.grid_row, parent, false);
        }

        TextView textViewTitle = (TextView) row.findViewById(R.id.title);
        ImageView imageViewItem = (ImageView) row.findViewById(R.id.image);

        textViewTitle.setText((CharSequence) products.get(position).getTitle());
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(),products.get(position).getImage());
        imageViewItem.setImageBitmap(bitmap);

        return row;

    }

}