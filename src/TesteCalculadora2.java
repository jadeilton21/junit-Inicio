import org.junit.jupiter.api.Test;

public class TesteCalculadora2 {



    @Test
    public void deveSomarDoisNumerosNegativos(){
        Calculadora2 calc2 = new Calculadora2();
        int somar = calc2.somar(30,23);


        System.out.println(somar);
    }
}
