package Encapsulamento;
//  Criando uma classe com nome e idade + um metodo apresentar()

public class Pessoa {

    // Deixando os atributos private para impedir de serem alterados pelo atributo diretamente
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Criando métodos public para acesso com controle (podemos fazer validações e tratamentos de erro).

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setNome(String nome){
        if(nome.length() < 2){
            System.out.println("Nome inválido.");
            return;
        }
        this.nome = nome;
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade inválida.");
            return;
        }
        this.idade = idade;
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
