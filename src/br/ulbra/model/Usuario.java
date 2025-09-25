package br.ulbra.model;

public class Usuario {

    private int id;
    private String login;
    private String nome;
    private String senha;
    private boolean ativo;

    public Usuario() {
    }

    public Usuario(int id, String login, String nome, String senha, Boolean ativo) {
        this.id = id;
        this.login = login;
        this.nome = nome;
        this.senha = senha;
        this.ativo = ativo;
    }

    public Usuario(int id, String login, String nome, Boolean ativo) {
        this.id = id;
        this.login = login;
        this.nome = nome;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

}
