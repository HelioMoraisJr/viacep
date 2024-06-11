package br.com.alura.viacep.buscacep;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.Gson;

// Classe responsável por buscar informações de um CEP usando a API do ViaCEP.
public class BuscadorViaCep {
    
    // Método que busca informações de um CEP.
    public InformacoesViaCep buscaCep(String cep) {        

        // Cria a URI para a consulta do CEP.
        URI endereco = URI.create("http://viacep.com.br/ws/" + cep + "/json/");

        // Cria uma requisição HTTP GET para a URI criada
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        
        try { 
            // Envia a requisição e obtém a resposta como uma String
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            
            // Converte o corpo da resposta JSON em um objeto InformacoesViaCep usando Gson
            return new Gson().fromJson(response.body(), InformacoesViaCep.class);
        } catch (Exception e) {
            // Lança uma exceção em caso de erro na requisição ou na conversão
            throw new RuntimeException("CEP invalido.");
        }
    }
}
