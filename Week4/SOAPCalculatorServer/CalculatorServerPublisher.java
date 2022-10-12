package calculator;

import jakarta.xml.ws.Endpoint;

public class CalculatorServerPublisher {
 
    public static void main(String[] args) {
        Endpoint ep = Endpoint.create(new CalculatorServerImpl());
        ep.publish("http://127.0.0.1:7777/rhys/calcServer");
    }
 
}
