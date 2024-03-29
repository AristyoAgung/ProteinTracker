package com.e.proteintracker;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("abc","test");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null){
            Log.d("ProteinTracker",savedInstanceState.getString("abc"));
        }
        TextView textView = (TextView)findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);
        Button myBtn = (Button)findViewById(R.id.button1);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                EditText myEditText = (EditText) findViewById(R.id.editText1);
                Log.d("ProteinTracker",myEditText.getText().toString());
            }
        });
        View.OnClickListener helpButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HelpActivity.class);

                Bundle b = new Bundle();

                EditText myEditText = (EditText)findViewById(R.id.editText1);

                b.putString("helpString",myEditText.getText().toString());
                intent.putExtras(b);

                startActivity(intent);
            }
        };
        Button helpBtn = (Button)findViewById(R.id.helpButton);
        helpBtn.setOnClickListener(helpButtonListener);
    }
}
