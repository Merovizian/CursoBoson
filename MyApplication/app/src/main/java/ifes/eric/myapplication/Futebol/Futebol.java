package ifes.eric.myapplication.Futebol;

import android.content.Context;
import android.widget.Toast;

public class Futebol {

    private String nomeTime = "Nenhum Time Selecionado";

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public void mostrartime(Context contexto){
        Toast.makeText(contexto,
                "SEU TIME DO CORAÇÃO é: " + nomeTime, Toast.LENGTH_LONG ).show();
    }
}
