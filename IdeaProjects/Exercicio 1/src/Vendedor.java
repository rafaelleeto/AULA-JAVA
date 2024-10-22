public class Vendedor extends Funcionario{


    double vendas;

    public Vendedor(){

    }

    public Vendedor(String nome, double salarioBase,double vendas){
        this.nome=nome;
        this.salarioBase=salarioBase;
        this.vendas=vendas;
    }

    public double calcularsalario(){

        return vendas*0.1+salarioBase;

    }
}
