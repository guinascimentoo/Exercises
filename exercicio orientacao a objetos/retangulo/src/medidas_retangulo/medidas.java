package medidas_retangulo;

public class medidas {
    public double largura;
    public double altura;

    public double area(){
        return altura * largura;
    }

    public double perimetro(){
        return  (altura + largura) * 2;
    }

    public double diagonal(){
        return Math.sqrt(altura * altura + largura * largura);
    }
}