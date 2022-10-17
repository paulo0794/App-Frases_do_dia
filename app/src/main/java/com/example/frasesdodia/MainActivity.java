package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase (View view) {

        String [] frases = {
                "Não ganhe o mundo e perca sua alma; sabedoria é melhor que prata e ouro.",
                "Se você agir sempre com dignidade, pode não melhorar o mundo, mas uma coisa é certa: haverá na Terra um canalha a menos.",
                "Choramos ao nascer porque chegamos a este imenso cenário de dementes.",
                "Viver é a coisa mais rara do mundo. A maioria das pessoas apenas existe.",
                "Não existe nada de completamente errado no mundo. Mesmo um relógio parado consegue estar certo duas vezes por dia.",
                "Comece onde você está, use o que você tem e faça o que você pode.",
                "Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.",
                "Devíamos ser ensinados a não esperar por inspiração para começar algo. Ação sempre gera inspiração. Inspiração raramente gera ação.",
                "Coragem é saber o que não temer.",
                "Conhecer a si mesmo é o começo de toda sabedoria."
        };

        int numero = new Random().nextInt(10);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);

    }

}