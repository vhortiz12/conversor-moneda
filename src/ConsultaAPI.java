import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class ConsultaAPI {

    private final MenuOpciones menu;

    public ConsultaAPI(MenuOpciones menu) {
        this.menu = menu;
    }

    public Moneda convertirMoneda() throws IOException, InterruptedException {
        // Codificar los parámetros de la URL
        String codigoBase = URLEncoder.encode(menu.getCodigoBase(), StandardCharsets.UTF_8);
        String codigoObjetivo = URLEncoder.encode(menu.getCodigoObjetivo(), StandardCharsets.UTF_8);
        String montoDinero = URLEncoder.encode(menu.getMontoDinero().toString(), StandardCharsets.UTF_8);

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/26f1693bdd803405e9ea9dae/pair/"
                + codigoBase + "/" + codigoObjetivo + "/" + montoDinero);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Validar si la respuesta es JSON
        if (isValidJSON(response.body())) {
            try {
                Moneda moneda = new Gson().fromJson(response.body(), Moneda.class);
                ResultadoConversion.mostrarResultado(menu.getMontoDinero(), moneda.base_code(), moneda);
                return moneda;
            } catch (JsonSyntaxException e) {
                System.out.println("Error parsing JSON: " + e.getMessage());
                return null;
            }
        } else {
            System.out.println("La respuesta no es un JSON válido: " + response.body());
            return null;
        }
    }

    // Método para validar si una cadena es un JSON válido
    private boolean isValidJSON(String json) {
        try {
            JsonElement jsonElement = JsonParser.parseString(json);
            return jsonElement.isJsonObject();
        } catch (JsonSyntaxException e) {
            return false;
        }
    }

}

