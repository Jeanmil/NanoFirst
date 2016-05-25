package com.example.jean.nanofirst;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Button1(View view){
        Context context = getApplicationContext();
        CharSequence text = "This Button Will Launch My Popular movies App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void Button2(View view){
        Context context = getApplicationContext();
        CharSequence text = "This Button Will Launch My Stock Hawk App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void Button3(View view){
        Context context = getApplicationContext();
        CharSequence text = "This Button Will Launch My Build it Together App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void Button4(View view){
        Context context = getApplicationContext();
        CharSequence text = "This Button Will Launch My Make your app material App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void Button5(View view){
        Context context = getApplicationContext();
        CharSequence text = "This Button Will Launch My Go Ubiquitous App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    public void Button6(View view){
        Context context = getApplicationContext();
        CharSequence text = "This Button Will Launch My Capstone App!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }


}
