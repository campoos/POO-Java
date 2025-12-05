package Tarefa.tarefa_calculadora;

public class Calculadora {

    public Double somar (double a, double b){
        return a + b;
    }

    public Double subtrair (double a, double b){
        return a - b;
    }

    public Double multiplicar (double a, double b){
        return a * b;
    }

    public Double dividir (double a, double b){
        if (b == 0){
            System.out.println("Não da pra dividir números por 0");
            //fallback
            return 0.0;
        }
        return a / b;
    }

    public Double potencia (double a, double b){
        return Math.pow(a, b);
    }

    public Double raizQuadrada(double n){
        if (n <= 0){
            System.out.println("Numéro inválido, selecione um número acima de 0");
            return 0.0;
        }
        return Math.sqrt(n);
    }
}
