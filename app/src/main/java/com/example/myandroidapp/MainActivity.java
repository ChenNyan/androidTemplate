package com.example.myandroidapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    // 重写 调用方法
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void success(View v) {
        EditText user;
        user = (EditText) findViewById(R.id.kuang1);
        TextView text;
        text = (TextView) findViewById(R.id.text);
        text.setText(user.getText().toString());
        Intent intent = new Intent(this, TwoActivity.class);
        startActivity(intent);
//        Toast.makeText(this, "成功", Toast.LENGTH_SHORT).show();
    }

    public void bad(View v) {
        Toast.makeText(this, "失败", Toast.LENGTH_SHORT).show();
    }

}