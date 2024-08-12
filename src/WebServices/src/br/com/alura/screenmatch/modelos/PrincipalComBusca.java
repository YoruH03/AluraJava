/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WebServices.src.br.com.alura.screenmatch.modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.Scanner;


/**
 *
 * @author Yuri
 */
public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Insira o filme que você quer pesquisar");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String endereco = "https://www.omdbapi.com/?t="+input+"&apikey=2c18c5c8";
        
        
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
             .uri(URI.create(endereco))
             .build();
        HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());//Esse código acessa o site e acessa uma determinada série e pega a info
        scanner.close();

    }    
}
