package com.zxl.hookby;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText editText;
    public String defString ;
    public Button testButton;
    private Button setDataBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit);
        testButton = findViewById(R.id.helloBtn);
        setDataBtn = findViewById(R.id.button);

        setDataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setData("我的天啊");
            }
        });
    }


    public void onClick(View view) {
        if (TextUtils.isEmpty(editText.getText().toString())) {
            Toast.makeText(this, "请输入内容", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    private void setData(String editStr) {
        if (!TextUtils.isEmpty(editStr)){
            defString = editStr;
        }
        Log.d("Xposed", "-----setData: ----"+defString);
    }

}
