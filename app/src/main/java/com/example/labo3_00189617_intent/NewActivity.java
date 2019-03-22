package com.example.labo3_00189617_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.labo3_00189617_intent.utils.AppConstant;

public class NewActivity extends AppCompatActivity {


    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        mTextView=findViewById(R.id.tv_message);
        Intent mIntent= getIntent();
        if (mIntent!=null) {
            mTextView.setText(mIntent.getStringExtra(AppConstant.TEXT_KEY));

        }
    }
}
