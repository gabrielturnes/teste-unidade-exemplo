package poo;

public class DivideInteiros {
    /**
     * Faz a divisão de dois inteiros
     * @param a operando 1
     * @param b operando 2
     * @return resultado da divisão dos operandos
     */
    public double divide(int a, int b){
        if(b != 0) {
            return (a / b);
        }

        return 0;
    }
}
