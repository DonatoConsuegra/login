package com.example.login1;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import kotlinx.coroutines.scheduling.Task;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void buttonIngresar(View view) {
        Toast.makeText(this, "Ingresa", Toast.LENGTH_SHORT).show();
        TextInputLayout tilusuario = findViewById(R.id.tilusuario);
        TextInputEditText txtCedula = findViewById(R.id.txtCedula);
        String cedula = txtCedula.getText().toString();
        if (cedula.equals("") || cedula.length()!=10) {
            tilusario.setError("Error ingrese una cédula válida");
        }
    }
    public void buttonCancelar(View view){
        Toast.makeText(this, "Ingresa", Toast.LENGTH_SHORT).show();
        TextInputLayout tilusuario = findViewById(R.id.tilusuario);
        TextInputEditText txtCedula = findViewById(R.id.txtCedula);
        String cedula = txtCedula.getText().toString();
        if (cedula.equals("") || cedula.length()!=10) {
            tilusario.setError("Error ingrese una cédula válida");
        }
    }
}