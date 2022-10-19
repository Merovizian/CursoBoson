package ifes.eric.myapplication.Futebol;

import static android.widget.Toast.LENGTH_LONG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

import ifes.eric.myapplication.MainActivity;
import ifes.eric.myapplication.R;
import ifes.eric.myapplication.Futebol.FutebolActivity;


public class FutebolActivity extends AppCompatActivity {
    FloatingActionButton FAB;
    TextInputEditText nomeTime;
    Button enviarTime;
    String Time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futebol);
        FAB = findViewById(R.id.FAB_futebol);
        nomeTime = findViewById(R.id.input_futebol_seuTime);
        enviarTime = findViewById(R.id.button_enviarTime);

        Futebol torcida = new Futebol();
        Toast.makeText(this, torcida.getNomeTime(), Toast.LENGTH_SHORT).show();

        enviarTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Time = nomeTime.getText().toString();
                torcida.setNomeTime(Time);
                torcida.mostrartime(FutebolActivity.this);


            }
        });




        FAB.setOnClickListener(view -> {
            Intent itent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(itent);
        });
    }
}