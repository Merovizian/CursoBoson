package ifes.eric.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.google.android.material.textfield.TextInputEditText;

import ifes.eric.myapplication.Futebol.Futebol;
import ifes.eric.myapplication.Futebol.FutebolActivity;
import ifes.eric.myapplication.MandaMensagem.MandaMensagem;
import ifes.eric.myapplication.MandaMensagem.MandaMensagemActivity;
import ifes.eric.myapplication.MetodosSobrecarredos.MetodosSobrecarregados;

public class MainActivity extends AppCompatActivity {
    Button metodoSobrecarregado, mandamensagem, getterANDsetter;
    String completo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        metodoSobrecarregado = findViewById(R.id.button_metodosSobrecarregados);
        mandamensagem = findViewById(R.id.button_mandamensagem);
        getterANDsetter = findViewById(R.id.button_getterANDsetter);

        Livro livroPrimeiro = new Livro();


        livroPrimeiro.nome = "Bóson Linux";
        livroPrimeiro.autor = "Fabio dos Santos";
        livroPrimeiro.preco = 45.55;
        livroPrimeiro.dataPub = "27/08/1989";
        livroPrimeiro.isbn = "89846";
        livroPrimeiro.descricao = "conta a historia de um estudante que vai desistir";

        //Resgata o metodo atraves do OBJETO
        completo = livroPrimeiro.dadosLivro();

        System.out.println(completo);

        metodoSobrecarregado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itent = new Intent(getApplicationContext(), MetodosSobrecarregados.class);
                startActivity(itent);
            }
        });



        mandamensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MandaMensagemActivity.class);
                startActivity(intent);

            }
        });


        getterANDsetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), FutebolActivity.class);
                startActivity(intent);

            }
        });




        //System.out.println("A data de publicação do livro " + livroPrimeiro.nome + " é " + livroPrimeiro.dataPub);
        //System.out.println("o valor é " + livroPrimeiro.preco + " e sua descriçao é \"" + livroPrimeiro.descricao + "\"");

    }

}