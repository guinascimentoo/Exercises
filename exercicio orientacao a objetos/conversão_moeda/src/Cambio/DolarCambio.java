package Cambio;

public class DolarCambio {

    public static final double IOF = 0.06;

    public static double conversao(double preco_Dolar, double quantia){
        return preco_Dolar * quantia * (1.0 + IOF);

    }
}
