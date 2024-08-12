/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WebServices.src.br.com.alura.screenmatch.modelos;

/**
 *
 * @author Yuri
 */
import java.io.IOException;
import java.net.URI;
import java.util.Scanner;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;





public class PrincipalComBuscaSolo {
    public static void main(String[] args) throws IOException, InterruptedException{
        System.out.println("Digite o que você quer buscar");
        Scanner scanner = new Scanner(System.in);
        String inputPesquisa = scanner.nextLine();
        
        String endereco = "https://www.omdbapi.com/?t="+inputPesquisa+"&apikey=2c18c5c8";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
             .uri(URI.create(endereco))
             .build();
        HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        scanner.close();
        
    }
    
}
