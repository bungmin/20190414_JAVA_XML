package com.hh.a20190414_java_xml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.hh.a20190414_java_xml.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView conTextView;
    EditText inputEditText;
    Button okBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("메인-onCreate", "정말 실행되나?");
        Log.e("메인-onCreate", "정말 실행되나?");

        conTextView = findViewById(R.id.contentTxtView);
        inputEditText = findViewById(R.id.inputEditText);
        okBtn = findViewById(R.id.okBtn);







    }
}
