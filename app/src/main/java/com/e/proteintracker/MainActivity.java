package com.e.proteintracker;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);
        Button myBtn = (Button)findViewById(R.id.button3);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                TextView myTextView = (TextView)findViewById(R.id.textView5);
                Log.d("ProteinTracker",myTextView.getText().toString());
            }
        });
    }
}
