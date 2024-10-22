public class Main {
    public static void main(String[] args) {
        Funcionario funcionario= new Funcionario("rafael",1500);
        Funcionario gerente=new Gerente("rafael",1500);
        Funcionario vendedor=new Vendedor("rafael",1500,900);

        System.out.println(funcionario.calcularsalario());
        System.out.println(vendedor.calcularsalario());
        System.out.println(gerente.calcularsalario());

        }
    }
