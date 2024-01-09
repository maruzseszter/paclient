import hu.szit.Client;

public class TodoService {
    String url;
    Client client;

    public TodoService() {
        url = "https://jsonplaceholder.typicode.com/todos";
        client = new Client();
    }

    public String getTodoTitles() {
        String result = client.get(url);
        return result;
    }
}