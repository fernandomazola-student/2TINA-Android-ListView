package br.com.fiap.a2tina_android_listview;

import java.io.Serializable;

/**
 * Created by logonrm on 23/03/2017.
 */

public class Contato implements Serializable {

    private String nome;
    private String telefone;
    private String sobre;
    private int imagem;

    public Contato(String nome, String telefone, String sobre, int imagem) {
        this.nome = nome;
        this.telefone = telefone;
        this.sobre = sobre;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
