package br.com.alura.viacep.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.viacep.buscacep.InformacoesCep;
import br.com.alura.viacep.buscacep.InformacoesViaCep;

public class Principal {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o CEP:");
		var busca  = leitor.nextLine();
		leitor.close();
				
		String endereco = "http://viacep.com.br/ws/" +busca+ "/json/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        
        String json = response.body();
        
        Gson gson = new GsonBuilder().create();
        
 		InformacoesViaCep informacoesViaCep  = gson.fromJson(json, InformacoesViaCep.class);

        
        
        InformacoesCep meuTitulo = new InformacoesCep(informacoesViaCep);            
        System.out.println("O Endereço é:");
        System.out.println(meuTitulo);
              
     

	}

}
