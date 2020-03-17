package com.example.tar42;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;
public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;
    Button btn1,btn2,btn3,btn4,btn5;
    Random rnd= new Random();
    int x=0;
    int y=0;
    int b=0;
    int countf=0;
    String st1="true";
    String st2="false";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.tv1);
        tv2=(TextView)findViewById(R.id.tv2);
        tv3=(TextView)findViewById(R.id.tv3);
        tv4=(TextView)findViewById(R.id.tv4);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn1);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);


    }

    public void start(View view) {
        b=1;
        x=rnd.nextInt(99)+1;
        y=rnd.nextInt(99)+1;
        tv3.setText(x);
        tv3.setText(y);
    }

    public void small(View view) {
        if ((x<y) &&(b==1)) {
            countf++;
            tv1.setText(countf);
        }
        else if(x<y){
        tv2.setText(st1);
        }
        else{
            tv2.setText(st2);
        }
    }

    public void equal(View view) {
        if((x==y)&&(b==1)){
            countf++;
            tv1.setText(countf);
        }
        else if(x==y){
        tv2.setText(st1);
        }
        else{
            tv2.setText(st2);
        }
    }

    public void big(View view) {
        if((x>y)&&(b==1)){
            countf++;
            tv1.setText(countf);
        }
        else if(x>y){
            tv2.setText(st1);
        }
        else{
            tv2.setText(st2);
        }
    }

    public void clear(View view) {
        b=0;
        countf=0;
        tv1.setText("");
        tv2.setText("");
        tv3.setText("");
        tv4.setText("");
    }
}

