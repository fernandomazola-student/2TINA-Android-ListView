package br.com.fiap.a2tina_android_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lstContatos;
    List<Contato> contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contatos = GeraContato.listaContato();
        ContatoAdapter contatoAdapter = new ContatoAdapter(this, contatos);
        lstContatos = (ListView)findViewById(R.id.lstContatos);
        lstContatos.setAdapter(contatoAdapter);

        lstContatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contato contato = contatos.get(position);
                //Toast.makeText(MainActivity.this, contato.getNome(), Toast.LENGTH_SHORT).show();
                Intent it = new Intent(MainActivity.this, ConversaActivity.class);
                it.putExtra("contato", contato);
                startActivity(it);
            }
        });
    }


}
