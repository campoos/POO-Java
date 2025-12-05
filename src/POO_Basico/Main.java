
// Usando a classe criada na Main

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(); //Criando uma instancia da classe Pessoa, a classe Pessoa no outro arquivo é apenas
        //um molde, quando a gente faz isso estamos fazendo uma copia para usar como objeto real, o objeto vai ter os
        //seus atributos próprios salvos e métodos independentes
        p1.nome = "João";
        p1.idade = 17;
        p1.apresentar();

        // o new cria um objeto novo na memória referenciado a classe molde
        // Pessoa é o molde que o new usa
        Pessoa p2 = new Pessoa();
        p2.nome = "Gabriela";
        p2.idade = 55;
        p2.apresentar();
    }
}