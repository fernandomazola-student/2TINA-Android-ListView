package br.com.fiap.a2tina_android_listview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 23/03/2017.
 */

public class GeraContato {
    public static List<Contato> listaContato(){
        List<Contato> contatos = new ArrayList<>();
        contatos.add(new Contato("Fernando", "11 971310854", "Hello World", R.drawable.person));
        contatos.add(new Contato("Fernando2", "11 9713108542", "Hello World2", R.drawable.personn));
        contatos.add(new Contato("Fernando3", "11 9713108543", "Hello World3", R.drawable.personnn));
        return contatos;
    }
}
