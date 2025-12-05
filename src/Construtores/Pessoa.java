package Construtores;
//  Criando uma classe com nome e idade + um metodo apresentar()

public class Pessoa {
    //Dados que pertencem a classe molde, eles são obrigatórios mesmo que declarados no objeto
    String nome;
    int idade;

    //construtor -> serve para eu obrigar a fornecer certo dado ao instanciar o objeto (tem que ter o mesmo nome da
    // classe molde)
    Pessoa(String nome, int idade){
        // o this serve para eu dizer ao Java que estou falando do atributo da classe.
        // caso o nome seja diferente não tem porque usar ele, EXEMPLO:

        // nome = n;
        // idade = i;

        // esquerda -> atributo da classe
        // direita  -> parametro do construtor que vem da instancia e é recebido pelo parametro do metodo.
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar(){
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
