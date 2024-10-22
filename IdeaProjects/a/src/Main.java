public class Main {
    public static void main(String[] args) {

       pessoa pessoa1 = new pessoa();
       // pessoa1.nome="Rafael";
       // pessoa1.idade= Integer.parseInt("20");
        //System.out.println(pessoa1.nome);
        //System.out.println(pessoa1.idade);
        //pessoa1.info();


        pessoa pessoa2 = new pessoa();
       // pessoa2.nome="Paulo";
       // pessoa2.idade=20;
      //  pessoa2.info();

        pessoa1.setNome("Rafael");
        pessoa1.setIdade(20);
        pessoa2.setNome("Paulo");
        pessoa2.setIdade(20);

        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());

        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());

    }
}
