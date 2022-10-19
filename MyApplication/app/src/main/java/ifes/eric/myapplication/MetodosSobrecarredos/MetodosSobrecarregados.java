package ifes.eric.myapplication.MetodosSobrecarredos;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

import ifes.eric.myapplication.MainActivity;
import ifes.eric.myapplication.MandaMensagem.MandaMensagem;
import ifes.eric.myapplication.R;

public class MetodosSobrecarregados extends AppCompatActivity {
    FloatingActionButton FAB;
    Double y, x;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.metodos_sobrecarregados);

        TextView textoSaida = findViewById(R.id.text_saida);
        Button calcular;
        TextInputEditText inputPrimeiro = findViewById(R.id.input_1);
        TextInputEditText inputSegundo = findViewById(R.id.input_2);
        FAB = findViewById(R.id.floatingActionButton);
        calcular = findViewById(R.id.button_calcular);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideKeybaord(view);
                y = Double.parseDouble(Objects.requireNonNull(inputPrimeiro.getText()).toString());

                if (inputSegundo.getText().toString().equals("")){
                    y = Expoente.elevar(y);
                    textoSaida.setText(Double.toString(y));
                }
                else{
                    x = Double.parseDouble(inputSegundo.getText().toString());
                    textoSaida.setText(Double.toString(Expoente.elevar(y,x)));
                }



            }


            private void hideKeybaord(View v) {
                InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(v.getApplicationWindowToken(),0);
            }
        });







/*
        if (inputPrimeiro.getText().toString() != ""){



        }

*/






        FAB.setOnClickListener(view -> {
            Intent itent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(itent);
        });

    }
}
