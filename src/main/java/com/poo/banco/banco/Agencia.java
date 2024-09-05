package com.poo.banco.banco;

// Atributos
public class Agencia {
    private int id;
    private String nome;
    private String numero;
    private Gerente gerenteGeral; // Ganha o dobro!
    private String telefone;
    private Endereco endereco;
    
    
    //Construtores
    
    public Agencia(int id, String nome, String numero, Gerente gerenteGeral, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.gerenteGeral = gerenteGeral;
        this.telefone = telefone;
        this.endereco = endereco;
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
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public Gerente getGerenteGeral() {
        return gerenteGeral;
    }
    public void setGerenteGeral(Gerente gerenteGeral) {
        this.gerenteGeral = gerenteGeral;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}