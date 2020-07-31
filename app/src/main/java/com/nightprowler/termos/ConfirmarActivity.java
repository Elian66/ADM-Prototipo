package com.nightprowler.termos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ConfirmarActivity extends AppCompatActivity {

    ImageView img;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar);

        img = findViewById(R.id.sign);
        btn = findViewById(R.id.btn_next);

        img.setImageBitmap(Common.USER_SIGNATURE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ConfirmarActivity.this, "Termos atualizados", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
