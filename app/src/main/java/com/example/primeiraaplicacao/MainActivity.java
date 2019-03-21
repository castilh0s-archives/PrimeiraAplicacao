package com.example.primeiraaplicacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void atualizarTexto(View view) {
        List<String> citacoes = Arrays.asList(
                "A maneira mais rápida de acabar com uma guerra é perdê-la.",
                "É um erro acreditar que é possível resolver qualquer problema importante usando batatas.",
                "Uma pessoa nunca está sozinha com um pato de borracha.",
                "O tempo é uma ilusão. A hora do almoço é uma ilusão maior ainda",
                "Quatro patas bom, duas patas ruim.",
                "Chimarrao."
        );
        Random aleatorio = new Random();

        TextView text = findViewById(R.id.meuTexto);
        text.setText(citacoes.get(aleatorio.nextInt(citacoes.size())));
    }
}
