package com.nightprowler.termos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.gcacace.signaturepad.views.SignaturePad;

public class AssinaturaB extends AppCompatActivity {

    SignaturePad signaturePad;
    Button corrigir, avancar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assinatura_b);

        corrigir = findViewById(R.id.corrigir);
        avancar = findViewById(R.id.avancar);

        corrigir.setEnabled(false);
        avancar.setEnabled(false);

        signaturePad = (SignaturePad) findViewById(R.id.signaturePad);
        signaturePad.setOnSignedListener(new SignaturePad.OnSignedListener() {

            @Override
            public void onStartSigning() {
                //Event triggered when the pad is touched
            }

            @Override
            public void onSigned() {
                //Event triggered when the pad is signed
                corrigir.setEnabled(true);
                avancar.setEnabled(true);
            }

            @Override
            public void onClear() {
                //Event triggered when the pad is cleared
                corrigir.setEnabled(false);
                avancar.setEnabled(false);
            }
        });

        corrigir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signaturePad.clear();
            }
        });

        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signaturePad.getSignatureBitmap();

                Common.USER_SIGNATURE = signaturePad.getSignatureBitmap();
                Intent intent = new Intent(AssinaturaB.this, ConfirmarActivity.class);
                startActivity(intent);
            }
        });
    }
}
