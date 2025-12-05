package Tarefa;

public class Main {
    public static void main(String[] args){
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        carro1.apresentar();

        Carro carro2 = new Carro("Honda", "Civic", 2018);
        carro2.apresentar();

        Carro carro3 = new Carro("Volkswagen", "Gol", 2015);
        carro3.apresentar();

        carro3.setAno(1886);
        carro3.apresentar();
    }
}
