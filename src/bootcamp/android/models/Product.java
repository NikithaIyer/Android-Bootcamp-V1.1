package bootcamp.android.models;

import android.graphics.Bitmap;
import android.widget.ImageView;

public class Product {
    private String title;
    private String description;
    private Integer image;

    public Product(String title, String description, Integer image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
