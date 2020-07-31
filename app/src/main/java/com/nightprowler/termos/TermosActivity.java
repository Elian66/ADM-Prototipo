package com.nightprowler.termos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class TermosActivity extends AppCompatActivity {

    TextView name, a, b;
    Button bnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_termos);

        name = findViewById(R.id.first_name);
        a = findViewById(R.id.termos_a);
        b = findViewById(R.id.termos_b);
        bnt = findViewById(R.id.btn_next);

        String string = Common.USER_NAME;
        String[] parts = string.split(" ");
        String part1 = parts[0];

        Calendar c = Calendar.getInstance();
        String ano =Integer.toString(c.get(Calendar.YEAR));
        String mes =Integer.toString(c.get(Calendar.MONTH)+1);
        String dia =Integer.toString(c.get(Calendar.DAY_OF_MONTH));

        name.setText("Olá, "+part1);
        a.setText("ÁGUAS DE MANAUS S/A, regularmente inscrita no CNPJ (MF) sob o nº. 03.264.927/0001-27, estabelecida na Av. André Araújo, nº 1.981, Aleixo – Manaus/AM, por meio do presente termo, concede, mediante as informações prestadas pelo titular da matricula de nº " + Common.USER_MATRICULA + " Sr (a) " + Common.USER_NAME + " inscrito (a) no CPF sob o nº " + Common.USER_CPF + " os benefícios decorrentes da Tarifa Social, nos termos da clausula 5ª do 5º termo aditivo ao Contrato de Concessão de Abastecimento de Água e Esgotamento Sanitário da cidade de Manaus, firmado entre o Município de Manaus e a Manaus Ambiental, observado os termos a seguir expostos:");
        b.setText("Manaus, " + dia + " de "+ Common.convertMonth(mes) + " de " + ano);

        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TermosActivity.this, AssinaturaA.class);
                startActivity(intent);
            }
        });
    }
}
