package Tarefa.tarefa_calculadora;

public class Main {
    public static void main(String[] args){
        Calculadora c1 = new Calculadora();

        System.out.println(c1.raizQuadrada(36));

        System.out.println(c1.raizQuadrada(0));

        System.out.println(c1.dividir(10, 0));

        System.out.println(c1.somar(10, 15));

        System.out.println(c1.subtrair(10, 15));

        System.out.println(c1.multiplicar(10, 15));
    }
}
