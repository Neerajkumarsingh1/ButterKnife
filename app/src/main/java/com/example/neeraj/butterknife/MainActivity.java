package com.example.neeraj.butterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn1)
   // @BindView(R.id.btn2)
    Button clickme;
    Button sub;
    int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  clickme = findViewById(R.id.btn1);
        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                clickme.setText(""+count);
            }
        });*/
        ButterKnife.bind(this);


    }

    @OnClick(R.id.btn1)
    public void count(){
        count++;
        clickme.setText(""+count);
    }

    @OnClick(R.id.btn2)
    public void count1(){
        count--;
        clickme.setText(""+count);
    }

}
