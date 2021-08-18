package com.javaex.ex06;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {

    private Button btn01Go;
    private Button btn02Go;
    private Button btn03Go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("javaStudy", "***액티비티03 onCreate()");
        setContentView(R.layout.activity_main3);

        btn01Go = (Button)findViewById(R.id.btn01Go);
        btn02Go = (Button)findViewById(R.id.btn02Go);
        btn03Go = (Button)findViewById(R.id.btn03Go);

        btn01Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("javaStudy", "*액티비티01 - 버튼01 클릭");
                Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btn02Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("javaStudy", "*액티비티01 - 버튼02 클릭");
                Intent intent = new Intent(Main3Activity.this, Main2Activity.class);
                startActivity(intent);
            }
        });

        btn03Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("javaStudy", "*액티비티01 - 버튼03 클릭");
                Intent intent = new Intent(Main3Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("javaStudy", "***액티비티03 onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("javaStudy", "***액티비티03 onResume()");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("javaStudy", "***액티비티03 onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("javaStudy", "***액티비티03 onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("javaStudy", "***액티비티03 onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("javaStudy", "***액티비티03 onRestart()");
    }
}
