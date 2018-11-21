package br.edu.ifsc.aluno.cc.daniel.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView mTextViewContador2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Bundle extras = getIntent().getExtras();
        int contador = extras.getInt("contador");

        mTextViewContador2 = findViewById(R.id.contador2);
        mTextViewContador2.setText(Integer.toString(contador));
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

    public void clicouNoOK(View view){

        Intent intent = new Intent();

        Bundle extras = new Bundle();
        extras.putString("Botao", "ok");
        intent.putExtras(extras);

        setResult(RESULT_OK, intent);

        finish();
    }

    /*public void clicouNoCancel(View view){

        Intent intent = new intent();

        Bundle extras = new Bundle();
        extras.putString("Botao", "Cancel");
        intent.putExtras(extras);

        setResult(RESULT_CANCELED, intent);

        finish();
    }*/


}
