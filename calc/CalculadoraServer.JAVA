package calc;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.soap.SOAPinding;
import javax.jws.soap.SOAPinding.Style;

@WebService
@SOAPinding(style = Style.RPC)
public interface CalculadoraServer{
    @WebMethod float soma(float num1, float num2);
    @WebMethod float subtracao(float num1, float num2);
    @WebMethod float divisao(float num1, float num2);
    @WebMethod float multiplicacao(float num1, float num2);
}