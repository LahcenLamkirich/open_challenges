package RestApi;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class JavaRest {

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8040),0);
        server.createContext("/api", (exchange -> {
            if("GET".equals(exchange.getRequestMethod())){
                String response = "Hello It's me Lahcen";
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream outputStream = exchange.getResponseBody();
                outputStream.write(response.getBytes());
                outputStream.flush();
            }else {
                exchange.sendResponseHeaders(405,-1);
            }
            exchange.close();
        }));

        server.setExecutor(null);
        server.start();
    }
}
