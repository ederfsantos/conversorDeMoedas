package requisicao;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requisicao {

    public String getRequisicao(String moedaOrigem, String moedaDestino, Double valor) {
        String chave = "d3fd3f8c8ec82300ac9b19c6";
        String urlBase = "https://v6.exchangerate-api.com/v6/d3fd3f8c8ec82300ac9b19c6/pair/USD/BRL/100";
        String url = "https://v6.exchangerate-api.com/v6/" + chave + "/pair/" + moedaOrigem + "/" + moedaDestino + "/" + valor;

        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            //System.out.println("Dados da resposta da requisição\n" + json);
            return json;

        } catch (Exception e) {
            throw new RuntimeException("Não consegui a cotação para a moeda informada! " + e.getMessage());
        }
    }
}