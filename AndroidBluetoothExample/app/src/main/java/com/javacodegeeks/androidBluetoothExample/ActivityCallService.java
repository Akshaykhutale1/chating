package com.javacodegeeks.androidBluetoothExample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.javacodegeeks.R;

public class ActivityCallService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_service);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);



        final EditText number = (EditText) findViewById(R.id.phoneNo);
        Button call = (Button) findViewById(R.id.dialBtn);


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getnumber = number.getText().toString();
                Intent callintent = new Intent(Intent.ACTION_CALL);
                callintent.setData(Uri.parse("tel: " +getnumber));
                startActivity(callintent);
            }



        });
    }

}
