package br.iff.pooa20172.trabalho02_2017_2;

import android.os.Bundle;

/**
 * Created by Higor on 29/11/2017.
 */

public class Evento {

    private String nome, data, local, promotor, patrocinio;
    private int capacidade;
    private double valor;
    private int imagem;

    public Evento(String nome, String data, String local, int capacidade, String promotor, String patrocinio, double valor, int imagem) {
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.capacidade = capacidade;
        this.promotor = promotor;
        this.patrocinio = patrocinio;
        this.valor = valor;
        this.imagem = imagem;
    }

    public Bundle toBundle(){
        Bundle bundle = new Bundle();
        bundle.putString("nome", nome);
        bundle.putString("data", data);
        bundle.putString("local", local);
        bundle.putString("promotor", promotor);
        bundle.putString("patrocinio", patrocinio);
        bundle.putInt("capacidade", capacidade);
        bundle.putDouble("valor", valor);
        return bundle;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getPromotor() {
        return promotor;
    }

    public void setPromotor(String promotor) {
        this.promotor = promotor;
    }

    public String getPatrocinio() {
        return patrocinio;
    }

    public void setPatrocinio(String patrocinio) {
        this.patrocinio = patrocinio;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valorIngresso) {
        this.valor = valorIngresso;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
