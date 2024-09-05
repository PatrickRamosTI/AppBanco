package com.poo.banco.banco;

public class Cliente {

    // Atributos
    private int id;
    private String nome;
    private String cpf;
    private String dataNascimento; 
    private String login;
    private String senha;
    private Endereco endereco;
    private String email;
    private String telefone;

    // Construtores
    public Cliente(int id, String nome, String cpf, String dataNascimento, String login, String senha,
            Endereco endereco, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public Endereco getEndereco() {
        return endereco;
    }


    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    // Métodos
    void imprimeFicha(){
        System.out.println(this.nome);
		System.out.println(this.cpf);
		System.out.println(this.dataNascimento);
		System.out.println(this.login);
		System.out.println(this.senha);
		System.out.println(this.email);
		System.out.println(this.telefone);
        
		this.endereco.imprimeEndereco();
    }

}