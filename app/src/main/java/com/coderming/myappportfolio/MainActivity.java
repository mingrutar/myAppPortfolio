package com.coderming.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static final String MESSAGE_FORMATTER = "This button will launch my %s app!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // the buttons has android:id defined
        View view = (Button) findViewById(R.id.bt_popular_movie);
        if ( view != null) {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Button button = (Button) v;
                    String projText =  button.getText().toString().toLowerCase();
                    Toast.makeText(v.getContext(), String.format(MESSAGE_FORMATTER, projText), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

    /***
     * the buttons has android:onClick()="sendMessage" defined. android:id is not needed
     * @param view
     */
    public void sendMessage(View view) {
        Button button = (Button) view;
        String projText =  button.getText().toString().toLowerCase();
        Toast.makeText(view.getContext(), String.format(MESSAGE_FORMATTER, projText), Toast.LENGTH_SHORT).show();
        // Do something in response to button click
    }
}
