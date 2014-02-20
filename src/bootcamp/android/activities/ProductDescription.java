package bootcamp.android.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import bootcamp.android.R;

/**
 * Created by nikitha on 20/02/14.
 */
public class ProductDescription extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product);
        Intent intent = getIntent();
        String resultValue = intent.getStringExtra("result");

        TextView resultView = (TextView) findViewById(R.id.title);
        resultView.setText(resultValue);

    }



}