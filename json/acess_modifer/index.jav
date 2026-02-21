import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiPostExample {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        doPost(client);
        doGet(client);
    }

    private static void doPost(HttpClient client) throws Exception {
        String jsonBody = """
            {
              "name": "Alice",
              "email": "alice@example.com"
            }
            """;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.example.com/users"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("POST Status: " + response.statusCode());
        System.out.println("POST Body: " + response.body());
    }

    private static void doGet(HttpClient client) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.example.com/users/1"))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("GET Status: " + response.statusCode());
        System.out.println("GET Body: " + response.body());
    }
}
