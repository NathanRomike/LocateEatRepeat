package comnathanromike.httpsgithub.locateeatrepeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class RestaurantsActivity extends AppCompatActivity {
    private ListView mListView;
    private String[] restaurants = new String[] {"Mi Mero Mole", "Mother's Bistro", "Life of Pie", "Screen Door", "Luc Lac", "Sweet Basil",  "Slappy Cakes", "Equinox", "Miss Delta's", "Andina", "Lardo", "Portland City Grill", "Fat Head's Brewery", "Chipotle", "Subway"};

    public static final String TAG = RestaurantsActivity.class.getSimpleName();
    private TextView mLocationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, restaurants);
        mListView.setAdapter(adapter);

        mLocationTextView = (TextView) findViewById(R.id.locationTextView);

        Intent intent = getIntent();
        String location = intent.getStringExtra("location");
        mLocationTextView.setText("Here are all the restaurants near: " + location);
    }
}
