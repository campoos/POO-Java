package Encapsulamento;
// Usando a classe criada na Pessoa

public class Main {
    public static void main(String[] args) {



        Pessoa p1 = new Pessoa("Joao", 17);

        p1.apresentar();

        //Agora para acessar os atributos eu preciso acessar pelos métodos
        System.out.println(p1.getIdade());
        p1.setIdade(22);
        System.out.println(p1.getIdade());

        System.out.println(p1.getNome());
        p1.setNome("João Victor Campos dos Santos");
        System.out.println(p1.getNome());

        p1.apresentar();
    }
}