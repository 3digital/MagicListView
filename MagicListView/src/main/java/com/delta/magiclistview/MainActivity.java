package com.delta.magiclistview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {


    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Place[] myPlacesArray = new Place[]
        {
            new Place("Delta Program", 78701),
            new Place("My House", 78702),
            new Place("Your House", 78702),
            new Place("Someones House", 78702),
            new Place("My Giant House", 90210),
            new Place("Ghost House", 99999),
            new Place("Delta Program Also", 78701),
            new Place("Quiznos", 78702),
            new Place("Earth", 78702),
            new Place("Next Door", 78702),
            new Place("My Small House", 90210),
            new Place("Non-Ghost House", 99999),
        };

        PlaceAdapter placeAdapter = new PlaceAdapter(getApplicationContext(),R.layout.list_row,myPlacesArray);

        mListView = (ListView) findViewById(R.id.listView);
        if(mListView != null){
            //USE IT
            mListView.setAdapter(placeAdapter);
        }

//        ArrayAdapter<Place> stringAdapter = new ArrayAdapter<Place>(getApplicationContext(),R.layout.list_row,myData);
//
//




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
