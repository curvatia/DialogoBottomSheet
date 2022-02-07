package com.example.dialogobottomsheet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements DialogosBottom.dialogosBottomListener {


    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.tvBtnClickado);


        Button btnModal = findViewById(R.id.btnModal);
        btnModal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogosBottom dialogosBottom = new DialogosBottom();
                dialogosBottom.show(getSupportFragmentManager(),"ejemplo");

            }
        });

    }

    @Override
    public void onButtonClicked(String text) {
        mTextView.setText(text);
    }
}