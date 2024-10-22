public class Funcionario {
   public String nome;
   public double salarioBase;

   public Funcionario(){

   }

   public Funcionario(String nome, double salarioBase){
       this.nome=nome;
       this.salarioBase=salarioBase;
   }

    public String getNome() {
        return nome;
    }

    public double calcularsalario() {
        return salarioBase;
    }

}
