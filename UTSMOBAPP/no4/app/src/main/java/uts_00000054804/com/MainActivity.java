package uts_00000054804.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnintent1 = (Button) findViewById(R.id.button1);
        btnintent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(a);
            }
        });
        Button btnintent2 = (Button) findViewById(R.id.button2);
        btnintent2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editnama= (EditText) findViewById(R.id.edtnama);
                Intent b = new Intent(getApplicationContext(),MainActivity3.class);
                b.putExtra("nama", editnama.getText().toString());
                startActivity(b);
            }
        });
    }
}