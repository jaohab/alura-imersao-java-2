package main.functions;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import main.exceptions.ClientHTTPException;
import main.res.Style;

public class ClientHTTP {

    public String findData(String url) {

        URI address = URI.create(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(address).GET().build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            String body = response.body();
            return body;
        } catch (IOException | InterruptedException e) {
            //throw new RuntimeException(e);
            throw new ClientHTTPException(
                Style.T_VERMELHA + 
                Style.NEGRITO + 
                "Erro ao buscar URL." +
                Style.RESETAR);
        }
    }
    
}
