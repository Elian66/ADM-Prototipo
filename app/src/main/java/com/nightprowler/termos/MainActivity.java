package com.nightprowler.termos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

public class MainActivity extends AppCompatActivity {

    EditText name, cpf, matricula;
    TextView tutorial;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.user_name);
        cpf = findViewById(R.id.user_CPF);
        matricula = findViewById(R.id.user_matricula);
        tutorial = findViewById(R.id.user_tutorial);
        btn = findViewById(R.id.btn_next);

        SimpleMaskFormatter smfDDD = new SimpleMaskFormatter("NNN.NNN.NNN-NN");
        MaskTextWatcher mtwDDD = new MaskTextWatcher(cpf, smfDDD);
        cpf.addTextChangedListener(mtwDDD);

        SimpleMaskFormatter smfM = new SimpleMaskFormatter("NNNNNNN-N");
        MaskTextWatcher mtwM = new MaskTextWatcher(matricula, smfM);
        matricula.addTextChangedListener(mtwM);

        tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TutorialActivity.class);
                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String a = name.getText().toString();
                final String b = cpf.getText().toString();
                final String c = matricula.getText().toString();

                Common.USER_NAME = a;
                Common.USER_CPF = b;
                Common.USER_MATRICULA = c;

                Intent intent = new Intent(MainActivity.this, TermosActivity.class);
                startActivity(intent);
            }
        });
    }
}
