package br.com.fiap.a2tina_android_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by logonrm on 23/03/2017.
 * Criando o componenente adapatar na mao para entender o seus metodos
 */

public class ContatoAdapter extends BaseAdapter{

    private Context context;
    private List<Contato> contatos;

    public ContatoAdapter(Context contenxt, List<Contato> contatos){
        this.context = contenxt;
        this.contatos = contatos;
    }

    @Override
    public int getCount() {
        return this.contatos.size();
        //Contalizar quantos itens ele precisa renderizar, ou seja, a quantidade de itens que vem na lista de contatos
    }

    @Override
    public Object getItem(int position) {
        //Quando ele precisar pegar algum items especifico ele vai chamar este metodo, entao ele ira pegar um item da lista, entao deve retornar a posicao dele
        return this.contatos.get(position);
    }

    @Override
    public long getItemId(int position) {
        //Dar um id para cada item, atraves to atributo position
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Esse metodo retorna a view que renderiza, ou seja, é o nossa relativelayour que criamos para listview

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        Contato contato = this.contatos.get(position);
        View view = layoutInflater.inflate(R.layout.listview_contatos, null);
        ImageView imgContato = (ImageView) view.findViewById(R.id.imgContato);
        TextView txtNome = (TextView) view.findViewById(R.id.txtNome);
        TextView txtSobre = (TextView) view.findViewById(R.id.txtSobre);

        imgContato.setImageResource(contato.getImagem());
        txtNome.setText(contato.getNome());
        txtSobre.setText(contato.getSobre());
        return view;
    }
}
