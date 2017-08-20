package iotapps.androidservice;

import android.app.Service;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    View v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // startService(v);

        stopService(v);



    }





// starting point of service
    public void startService(View view) {
        startService(new Intent(getBaseContext(), serviceone.class));
    }

    // stopping of the service
    public void stopService(View view) {
        stopService(new Intent(getBaseContext(), serviceone.class));
    }





}
