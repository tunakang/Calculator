package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText edit;
    Button btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btn7 = (Button)findViewById(R.id.btn_7);
         edit= (EditText)findViewById(R.id.etd);

        /*View.OnClickListener cl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==btn7){
                    edit.setText(edit.getText().toString()+7);
                }
            }
        };*/
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v==btn7){
                    edit.setText(edit.getText().toString()+7);
                }
            }
        });
    }

}
