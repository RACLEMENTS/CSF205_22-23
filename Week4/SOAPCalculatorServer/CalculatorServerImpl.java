package calculator;

import jakarta.jws.WebService;

@WebService(endpointInterface = "calculator.CalculatorServer")
public class CalculatorServerImpl implements CalculatorServer {
 
    @Override
    public int add(int a, int b) {
        return a + b;
    }
 
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
 
    @Override
    public int multiply(int a, int b) {
        return a * b;
    }
 
    @Override
    public int divide(int a, int b) {
        return a / b;
    }
 
}
