package org.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Logica logica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.txt_midden);
        logica = new Logica();
    }

    public void doeIets(View view) {
        if (view.getId() == R.id.btn_een)
        {
            textView.setText(R.string.button_clicked);
        } else {
            Toast.makeText(this, getText(R.string.toast_sorry), Toast.LENGTH_LONG).show();
        }
    }
}