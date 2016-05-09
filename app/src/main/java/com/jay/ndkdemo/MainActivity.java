package com.jay.ndkdemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("jnidemo");
    }

    private TextView textView;
    private JniDemo jniDemo;
    private static Context sContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sContext = getApplicationContext();
        setContentView(R.layout.activity_main);

        jniDemo = new JniDemo();
        textView = (TextView) findViewById(R.id.textView);
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(jniDemo.getHelloWordText());
            }
        });
    }

    public static void showToast() {
        Toast.makeText(sContext, "此方法由Native方法调用", Toast.LENGTH_SHORT).show();
    }
}
