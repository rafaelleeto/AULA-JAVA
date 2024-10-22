public class Gerente extends Funcionario{

    public Gerente(){

    }

    public Gerente(String nome, double salarioBase){
        this.nome=nome;
        this.salarioBase=salarioBase;
    }

    public double calcularsalario(){

        return salarioBase*1.2;
    }

}
