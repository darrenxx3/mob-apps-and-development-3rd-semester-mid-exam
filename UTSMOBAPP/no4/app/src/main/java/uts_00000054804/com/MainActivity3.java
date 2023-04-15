package uts_00000054804.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView texthasil = (TextView) findViewById(R.id.textViewHasil);
        Intent i = getIntent();
        String hasilnya= "Halo "+i.getStringExtra("nama");
        texthasil.setText(hasilnya);
    }
}