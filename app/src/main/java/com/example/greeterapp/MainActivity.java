package com.example.greeterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greet(View view) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.greeting_text_view);
        TextView nameTextView = (TextView) findViewById(
                R.id.name_text_view);
        if (nameTextView.getText().length() != 0) {
            quantityTextView.setText("Hello, " + nameTextView.getText());
        } else {
            displayToast();
        }
    }

    private void displayToast() {
        Context context = getApplicationContext();
        CharSequence text = "Please, fill the field with your name";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}