package br.edu.ifsc.aluno.cc.daniel.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
    }

    public void exibirMensagem(View view) {
        //Toast toast = Toast.makeText(this,R.string.texto_saudacao, Toast.LENGTH_LONG);
        //toast.show();

        /*Uri uri = Uri.parse("http://docente.ifsc.edu.br/mello");
        Intent it = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(it);*/

        Intent messageIntent = new Intent(this,TerceiraActivity.class);
        startActivity(messageIntent);

    }
}
