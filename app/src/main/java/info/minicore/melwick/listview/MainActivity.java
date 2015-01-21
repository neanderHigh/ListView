package info.minicore.melwick.listview;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


// This is the entry point
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        String[] animals = res.getStringArray(R.array.animals);

        // We need a ListAdapter to adapt the Array to the ListView:
        ListAdapter myArrayAdapter = new MyArrayAdapter(
                this,                        // context
                R.layout.row_layout_triple,  // layoutResource int
                R.id.triple_user,            // textViewResourceId int
                animals                      // list of objects
        );
                /*
                When you specify your own row layout, you must specify the id (e.g. firstLine)
                of the view element which shall contain the array elements

                Another Basic Example:
                ListAdapter myArrayAdapter = new ArrayAdapter<>(
                                          this, android.R.layout.simple_list_item_1, animals);
                */

        ListView theListView = (ListView) findViewById(R.id.myListView);
            // Define a reference to the ListView in our layout resource

        theListView.setAdapter(myArrayAdapter);
            // Tell listView what data to use


        // catch any clicks on our listView:
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {

                // Display a message with Toast:
                String animalPicked = "You selected " + String.valueOf(adapterView.getItemAtPosition(pos));
                Toast.makeText(MainActivity.this, animalPicked, Toast.LENGTH_SHORT).show();

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
