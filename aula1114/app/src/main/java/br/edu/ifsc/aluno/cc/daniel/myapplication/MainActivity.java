package br.edu.ifsc.aluno.cc.daniel.myapplication;

import android.content.Intent;
import android.net.Uri;
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
        if(savedInstanceState != null){
            int count = savedInstanceState.getInt("count");
            if(mTextViewContador != null) {
                mTextViewContador.setText(""+count);
            }
        }
    }

    public void incrementarContador(View view) {
        this.mcontador = this.mcontador + 1;
        mTextViewContador.setText(Integer.toString(this.mcontador));
    }

    public void exibirMensagem(View view) {
        //Toast toast = Toast.makeText(this,R.string.texto_saudacao, Toast.LENGTH_LONG);
        //toast.show();

        /*Uri uri = Uri.parse("http://docente.ifsc.edu.br/mello");
        Intent it = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(it);*/

        Intent intent = new Intent(this,SegundaActivity.class);
        Bundle extras = new Bundle();
        extras.putInt("contador", mcontador);
        startActivityForResult(intent,20);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count",mcontador);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 20){
            //colocar contador em zero
            System.out.println("0");
            if (resultCode == RESULT_OK)
                //imprimir no LOG que foi cancelado
                System.out.println("Cancelado");
        }
    }
}
