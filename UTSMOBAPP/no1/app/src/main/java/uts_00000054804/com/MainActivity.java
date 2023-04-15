package uts_00000054804.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("position","onCreate");
        Button buttonLOG = (Button) findViewById(R.id.button1);
        buttonLOG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("action","This button already clicked");
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("position","onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("position","onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("position","onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("position","onStop");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("position","onRestart");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("position","onDestroy");
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i("position","onSaveInstanceState");
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("position","onRestoreInstanceState");
    }
}