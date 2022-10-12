package primeNumberServer;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.jws.soap.SOAPBinding.Style;
 
@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface PrimeNumberServer {
   
    @WebMethod
    public boolean isPrimeNumber(int number);
}
