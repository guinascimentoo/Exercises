package func;

public class Salario {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido(){
        return salarioBruto - taxa;
    }

    public void aumentarSalario(double porcentagem){
        salarioBruto += salarioBruto * porcentagem / 100;
    }

    public String toString(){
        return nome + ", $ " + String.format("%.2f%n", salarioLiquido());
    }
}