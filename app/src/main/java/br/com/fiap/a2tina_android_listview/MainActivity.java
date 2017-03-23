package br.com.fiap.a2tina_android_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lstContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Contato> contatos = GeraContato.listaContato();
        ContatoAdapter contatoAdapter = new ContatoAdapter(this, contatos);
        lstContatos = (ListView)findViewById(R.id.lstContatos);
        lstContatos.setAdapter(contatoAdapter);
    }


}
