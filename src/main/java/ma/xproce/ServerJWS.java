package ma.xproce;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
        public static void main(String[] args) {
            Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        }
}
