package calculator;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;
 
@WebService
@SOAPBinding(style = Style.RPC)
public interface CalculatorServer {
    @WebMethod
    int add(int a, int b);
 
    @WebMethod
    int subtract(int a, int b);
 
    @WebMethod
    int multiply(int a, int b);
 
    @WebMethod
    int divide(int a, int b);
}