package br.com.alura.viacep.principal;

import java.io.IOException;
import java.util.Scanner;

import br.com.alura.viacep.buscacep.BuscadorViaCep;
import br.com.alura.viacep.buscacep.InformacoesViaCep;

public class Principal {

    // Método principal que será executado ao iniciar o programa
    public static void main(String[] args) throws IOException, InterruptedException {
        
        // Criado um Scanner para leitura de dados do console
        Scanner leitor = new Scanner(System.in);
        // Instancia um objeto BuscadorViaCep para realizar a consulta do CEP
        BuscadorViaCep consultaCep = new BuscadorViaCep();
        
        // Solicita ao usuário que digite o CEP
        System.out.println("Digite o CEP:");
        var cep  = leitor.nextLine();
        // Fecha o Scanner
        leitor.close();    
        
        try {
            // Tenta buscar as informações do CEP digitado
            InformacoesViaCep novoCep = consultaCep.buscaCep(cep);
            // Imprime as informações do CEP
            System.out.println(novoCep);
        } catch (RuntimeException e) {
            // Captura exceções e imprime a mensagem de erro
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }       
    }
}
