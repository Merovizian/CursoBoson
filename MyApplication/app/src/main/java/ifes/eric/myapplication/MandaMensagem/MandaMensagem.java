package ifes.eric.myapplication.MandaMensagem;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import ifes.eric.myapplication.MainActivity;
import ifes.eric.myapplication.R;

public class MandaMensagem extends AppCompatActivity {
    public String amoedo =  "MACACO VELHO";

    public void enviaMensagem(Context context, String nomePessoa, int idade ){
        Toast.makeText(context, "Bem Vindo à casa de " + nomePessoa + "\nIdade: " +
                String.valueOf(idade),
                Toast.LENGTH_LONG).show();
    }

    public void mandaBoasVindas(Context context){
        Toast.makeText(context, "Curso de Tudo",
                Toast.LENGTH_LONG).show();
    }





}
