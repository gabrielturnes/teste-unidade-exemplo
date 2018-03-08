package poo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TesteDivisao {
    @Parameterized.Parameters(name = "{index}: divisao({0},{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 2, 1, 2 },
                { -2, 1, -2 },
                { -2, -1, 2 },
                { 2, 0, 0 },
                { 2, 2, 1 },
                { 2, -1, -2 },
                { 0, -1, 0 },
                {1, 2, 0.5}
        });
    }

    @Parameterized.Parameter(0)
    public int operandoUm;

    @Parameterized.Parameter(1)
    public int operandoDois;

    @Parameterized.Parameter(2)
    public double resultado;

    @Test
    public void teste(){
        DivideInteiros obj = new DivideInteiros();
        assertEquals("erro no teste", resultado, obj.divide(operandoUm, operandoDois), 5);
    }
}
