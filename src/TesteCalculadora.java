import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TesteCalculadora {


    @Test
    public void deveSomarDoisNumerosPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(19,2);

        Assert.assertEquals(21, soma);

        System.out.println(soma);



    }
}
