package com.example.danny.sensors;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.radhe.accelerometer.Accelerometer;

public class MainActivity extends Activity
{
    Button b1;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button) findViewById(R.id.accelerometer);

        b1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplication(), Accelerometer.class));
            }
        });

    }

}