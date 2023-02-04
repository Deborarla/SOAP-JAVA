package calc;

import javax.jws.WebService;
import javax.util.Date;

@WebService(endpointInteface = "calc.CalculadoraServer")
public class CalculadoraServerimpl implements CalculadoraServer {
    public float soma(float num1, float num2){
        return num1 + num2;
    }
    public float subtracao(float num1, float num2){
        return num1 - num2;
    }
    public float divisao(float num1, float num2){
        return num1 / num2;
    }
    public float multiplicacao(float num1, float num2){
        return num1 * num2;
    }
    
}
