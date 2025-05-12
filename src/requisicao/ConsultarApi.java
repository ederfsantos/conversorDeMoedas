package requisicao;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarApi {

    public String getRequisicao(String nomeDaMoeda) {
        String url = "";

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