package com.example.handsonjavaappclockdigital;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView androidTxtHoraAtual;
    private TextClock androidTxtHora24PM_AM, androidTxtHora12PM_AM;
    private Button androidBotao;
    private CalendarView androidCalendario;

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

        iniciarComponentesDeLayout();

        capturarHoraAtual();

    }

    private void capturarHoraAtual() {

        androidBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                androidTxtHoraAtual.setText("Hora: " + androidTxtHora24PM_AM.getText() + "\n\nHora: " + androidTxtHora12PM_AM.getText());

            }
        });

    }

    private void iniciarComponentesDeLayout() {

        androidTxtHoraAtual = findViewById(R.id.androidTxtHoraAtual);
        androidTxtHora24PM_AM = findViewById(R.id.androidTxtHora24PM_AM);
        androidTxtHora12PM_AM = findViewById(R.id.androidTxtHora12PM_AM);
        androidBotao = findViewById(R.id.androidBotao);
        androidCalendario = findViewById(R.id.androidCalendario);

    }
}