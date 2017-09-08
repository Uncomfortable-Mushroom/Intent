package com.example.lenovo.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        Button button1=(Button)findViewById(R.id.button1);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Intent intent=new Intent("com.exmaple.activitytest.ACTION_START");
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent1=new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://www.baid.com"));
                startActivity(intent1);
            case R.id.button3:
                Intent intent2=new Intent(Intent.ACTION_DIAL);
                intent2.setData(Uri.parse("tel:11011"));
                        startActivity(intent2);

            default:
                break;
        }
    }
}
