package Construtores;
// Usando a classe criada na Pessoa

public class Main {
    public static void main(String[] args) {

        //Agora com construtores podemos chamar de forma mais simples, mas de forma obrigatóra a nova instancia.
        Pessoa p1 = new Pessoa("Joao", 17);
//        p1.nome = "João";
//        p1.idade = 17;
        p1.apresentar();


        Pessoa p2 = new Pessoa("Gabriela", 30);
//        p2.nome = "Gabriela";
//        p2.idade = 55;
        p2.apresentar();
    }
}