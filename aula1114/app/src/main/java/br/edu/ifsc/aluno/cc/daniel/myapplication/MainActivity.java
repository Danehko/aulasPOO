package br.edu.ifsc.aluno.cc.daniel.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mcontador = 0;
    private TextView mTextViewContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mTextViewContador = findViewById(R.id.tvContador);
    }

    public void incrementarContador(View view) {
        this.mcontador = this.mcontador + 1;
        mTextViewContador.setText(Integer.toString(this.mcontador));
    }

    public void exibirMensagem(View view) {
        Toast toast = Toast.makeText(this,R.string.texto_saudacao, Toast.LENGTH_LONG);
        toast.show();
    }
}
