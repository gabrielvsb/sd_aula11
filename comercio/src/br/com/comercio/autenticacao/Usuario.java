package br.com.comercio.autenticacao;

import java.io.Serializable;

public class Usuario implements Serializable{
    private String nome,perfil;

    public Usuario(String nome, String perfil){
        this.nome = nome;
        this.perfil = perfil;
    }

    public String getNome(){
        return nome;
    }

    public String setNome(String nome){
        return this.nome = nome;
    }

    public String getPerfil(){
        return perfil;
    }

    public String setPerfil(String perfil){
        return this.perfil = perfil;
    }

}
