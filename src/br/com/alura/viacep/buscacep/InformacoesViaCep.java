package br.com.alura.viacep.buscacep;

// Define um registro (record) chamado InformacoesViaCep com os campos cep, logradouro, complemento, bairro, localidade e uf
public record InformacoesViaCep(String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {

}
