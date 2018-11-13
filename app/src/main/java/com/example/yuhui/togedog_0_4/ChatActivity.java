package com.example.yuhui.togedog_0_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ChatActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        Button button = (Button)findViewById(R.id.Notice_bt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),InforActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button)findViewById(R.id.Vote_bt);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), VoteActivity.class);
                startActivity(intent2);
            }
        });

        //뒤로
        Button button3 =(Button)findViewById(R.id.Back_bt);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent3);
            }
        });

        //맴버
        Button button4 =(Button)findViewById(R.id.Member_bt);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4= new Intent(getApplicationContext(), MemberActivity.class);
                startActivity(intent4);
            }
        });


    }
}
