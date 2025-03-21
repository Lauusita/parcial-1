package com.laura.parcial_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView user;
    TextView pass;
    Button ingresar;

    String correctUser, correctPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        ingresar = findViewById(R.id.ingresar);

        correctUser = "uac123";
        correctPass = "12345678";

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String u = user.getText().toString();
                String p = pass.getText().toString();

                if ( u.isEmpty() || p.isEmpty() ) {
                    Toast.makeText(MainActivity.this, "Por favor llenar los campos", Toast.LENGTH_SHORT).show();
                } else if (u.compareTo(correctUser) != 0 || p.compareTo(correctPass) != 0) {
                    Toast.makeText(MainActivity.this, "El usuario o la contraseña son incorrectos", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(MainActivity.this, SecondView.class);
                    startActivity(i);
                }
            }
        });
    }
}