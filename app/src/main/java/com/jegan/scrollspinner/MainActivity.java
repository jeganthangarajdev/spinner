package com.jegan.scrollspinner;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner s1;
    List<String> mylist;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = (Spinner) findViewById(R.id.spinner);
        s1.setOnItemSelectedListener(this);
        mylist = new ArrayList<String>();
        mylist.add("apple");
        mylist.add("mango");
        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, mylist);
        myadapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        s1.setAdapter(myadapter);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Item Clicked", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Selected Item:"+mylist.get(position), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}


