package com.example.passdatafromfragmenttoactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView name, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        MyFragment myFragment = new MyFragment();
        transaction.add(R.id.linearLayout, myFragment);
        transaction.commit();
    }

    public void f1(String s1, String s2){
        name = (TextView) findViewById(R.id.actText1);
        address = (TextView) findViewById(R.id.actText2);
        name.setText(s1);
        address.setText(s2);
    }
}
