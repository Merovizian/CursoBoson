package ifes.eric.myapplication.MandaMensagem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

import ifes.eric.myapplication.MainActivity;
import ifes.eric.myapplication.R;

public class MandaMensagemActivity extends AppCompatActivity {
    FloatingActionButton FAB;
    Button enviarNome;
    TextInputEditText mandarNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manda_mensagem);
        FAB = findViewById(R.id.FAB_MandaMensagem);
        enviarNome = findViewById(R.id.button_enviarNome);
        mandarNome = findViewById(R.id.input_mandaMensagem);



        FAB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent itent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(itent);
            }
        });


        enviarNome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextInputEditText textoMandarMensagem;
                textoMandarMensagem = findViewById(R.id.input_mandaMensagem);

                // Cria um OBJETO do tipo MandaMensagem o Contexto serve para direcionar o Toast a tal intent
                MandaMensagem mandaMensagem = new MandaMensagem();
                mandaMensagem.mandaBoasVindas(MandaMensagemActivity.this);
                mandaMensagem.enviaMensagem(MandaMensagemActivity.this,
                        textoMandarMensagem.getText().toString(), 32);


            }
        });

    }
}

