package br.com.fiap.a2tina_android_listview;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ConversaActivity extends AppCompatActivity {

    ImageView imgContato;
    TextView txtNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversa);

        Contato contato = (Contato)getIntent().getExtras().get("contato");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(contato.getNome());

        imgContato = (ImageView) findViewById(R.id.imgContato);
        imgContato.setImageResource(contato.getImagem());

        txtNome = (TextView) findViewById(R.id.txtNome);
        txtNome.setText(contato.getNome());
    }
}
