package com.buldu.myapplication;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Canada extends AppCompatActivity {

    ImageView up, down, right, left, stan;
    ConstraintLayout constraintLayout;
    ConstraintSet constraintSet;
    TextView sayacx, sayacy;
    int x = 225, y = 75;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canada);
        stan = (ImageView) findViewById(R.id.stan);
        up = (ImageView) findViewById(R.id.up);
        down = (ImageView) findViewById(R.id.down);
        left = (ImageView) findViewById(R.id.left);
        right = (ImageView) findViewById(R.id.right);
        sayacx = (TextView) findViewById(R.id.sayacx);
        sayacy = (TextView) findViewById(R.id.sayacy);

        constraintLayout = (ConstraintLayout) findViewById(R.id.canadaaa);
        constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);
        constraintSet.setMargin(stan.getId(), ConstraintSet.END, x);
        constraintSet.setMargin(stan.getId(), ConstraintSet.BOTTOM, y);
        constraintSet.applyTo(constraintLayout);

        sayacx.setText(String.valueOf(x));
        sayacy.setText(String.valueOf(y));

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y+=50;
                constraintSet = new ConstraintSet();
                constraintSet.clone(constraintLayout);
                constraintSet.setMargin(stan.getId(), ConstraintSet.BOTTOM, y);
                constraintSet.applyTo(constraintLayout);
                sayacy.setText(String.valueOf(y));
                if(y==375 && x==1575){
                    startActivity(new Intent(Canada.this,Pop.class));
                }
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y-=50;
                constraintSet = new ConstraintSet();
                constraintSet.clone(constraintLayout);
                constraintSet.setMargin(stan.getId(), ConstraintSet.BOTTOM, y);
                constraintSet.applyTo(constraintLayout);
                sayacy.setText(String.valueOf(y));
                if(y==375 && x==1575){
                    startActivity(new Intent(Canada.this,Pop.class));
                }
            }
        });

        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x+=50;
                constraintSet = new ConstraintSet();
                constraintSet.clone(constraintLayout);
                constraintSet.setMargin(stan.getId(), ConstraintSet.END, x);
                constraintSet.applyTo(constraintLayout);
                sayacx.setText(String.valueOf(x));
                if(y==375 && x==1575){
                    startActivity(new Intent(Canada.this,Pop.class));
                }
            }
        });

        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x-=50;
                constraintSet = new ConstraintSet();
                constraintSet.clone(constraintLayout);
                constraintSet.setMargin(stan.getId(), ConstraintSet.END, x);
                constraintSet.applyTo(constraintLayout);
                sayacx.setText(String.valueOf(x));
                if(y==375 && x==1575){
                    startActivity(new Intent(Canada.this,Pop.class));
                }
            }
        });

    }
}
