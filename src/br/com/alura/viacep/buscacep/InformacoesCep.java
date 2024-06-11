package br.com.alura.viacep.buscacep;

import com.google.gson.annotations.SerializedName;

// Classe 
public class InformacoesCep {

    // Campos privados com anotações para mapear os nomes das chaves no JSON recebido
    @SerializedName("cep")
    private String cep;
    @SerializedName("logradouro")
    private String logradouro;
    @SerializedName("complemento")
    private String complemento;
    @SerializedName("bairro")
    private String bairro;
    @SerializedName("localidade")
    private String cidade;
    @SerializedName("uf")
    private String estado;

    // Construtor padrão
    public InformacoesCep() {
    }        

    // Construtor que inicializa os campos com base em um objeto InformacoesViaCep
    public InformacoesCep(InformacoesViaCep informacoesViaCep) {
        this.cep = informacoesViaCep.cep();
        this.logradouro = informacoesViaCep.logradouro();
        this.bairro = informacoesViaCep.bairro();
        this.cidade = informacoesViaCep.localidade();
        this.estado = informacoesViaCep.uf();
    }

    // Métodos getters e setters para cada campo

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Sobrescrevendo o método toString() para fornecer uma representação textual do objeto
    @Override
    public String toString() {
        return "Cep: " + cep + "\n" +
               "Logradouro: " + logradouro + "\n" +
               "Bairro: " + bairro  + "\n" +
               "Cidade: " + cidade +  "\n" +
               "Estado: " + estado;
    }
}
