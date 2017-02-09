package com.example.bjtke_000.sample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.AdapterView;
import android.widget.EditText;
import android.view.View;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.view.Menu;

import static android.widget.AdapterView.*;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE="com.example.myfirstapp.MESSAGE";
    String[] optionArray={"Life", "Work", "Business", "Government"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter=new ArrayAdapter<String>(this, R.layout.activity_menu, optionArray);
        ListView listview= (ListView) findViewById(R.id.option_list);
        listview.setAdapter(adapter);
        //final Context context=this;
        //listview.setOnItemClickListener(new AdapterView.OnItemClickListener());
    }

    public void sendMessage(View view){
        /*Intent intent=new Intent(this, DisplayMessageActivity.class);
        EditText editText=(EditText) findViewById(R.id.edit_message);
        String message=editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);*/
    }

    public void advance(AdapterView<?> parent,View view,int position,long id){
        Intent intent=new Intent(this, LifeMenuActivity.class);
        EditText editText=(EditText) findViewById(R.id.edit_message);
        String message=editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
