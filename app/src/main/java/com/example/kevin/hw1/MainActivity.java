package com.example.kevin.hw1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText input;
    Button say;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        input = (EditText)findViewById(R.id.ET);
        say = (Button)findViewById(R.id.BTN);
        say.setOnClickListener(hello);
            }

    private View.OnClickListener hello = new View.OnClickListener() {


        @Override
        public void onClick(View v) {
            String str =input.getText().toString();

            if(str!=""){
                Toast.makeText(MainActivity.this, "Hello "+str, Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(MainActivity.this, "You must input someyhing", Toast.LENGTH_SHORT).show();
            }
        }
    };


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
            AlertDialog.Builder about = new AlertDialog.Builder(this);
            about.setTitle("About this App");
            about.setMessage("Author:張凱閔");

            DialogInterface.OnClickListener Listener = new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            };
            about.setPositiveButton("OK", Listener);
            about.show();
        }
        return super.onOptionsItemSelected(item);
    }
}
