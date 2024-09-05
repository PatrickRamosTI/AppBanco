package com.poo.banco.banco;

public class Gerente {

    // Dados da pessoa
    private int id;
    private String nome;
    private String cpf;
    private String dataNascimento; 
    private String login;
    private String senha;
    private Endereco endereco;
    private String email;
    private String telefone;    

    //Dados do funcionário
    private String matricula;
    private String dataPromocao;
    private double salario;
    private Agencia agenciaAlocado;

    // Construtores
    public Gerente(int id, String nome, String cpf, String dataNascimento, String login, String senha,
            Endereco endereco, String email, String telefone, String matricula, String dataPromocao, double salario,
            Agencia agenciaAlocado) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.login = login;
        this.senha = senha;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.matricula = matricula;
        this.dataPromocao = dataPromocao;
        this.salario = salario;
        this.agenciaAlocado = agenciaAlocado;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataPromocao() {
        return dataPromocao;
    }

    public void setDataPromocao(String dataPromocao) {
        this.dataPromocao = dataPromocao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Agencia getAgenciaAlocado() {
        return agenciaAlocado;
    }

    public void setAgenciaAlocado(Agencia agenciaAlocado) {
        this.agenciaAlocado = agenciaAlocado;
    }

   





    
}