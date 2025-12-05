package Tarefa;

public class Carro {

    // Definindo atributos
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public void setMarca(String marca){
        if (marca.length() < 2){
            System.out.println("Nome de marca inválido");
            return;
        }
        this.marca = marca;
    }

    public void setModelo(String modelo){
        if(modelo.length() < 2){
            System.out.println("Nome de modelo inválido");
        }
    }

    public void setAno(int ano){
        if (ano <= 1885){
            System.out.println("Ano inválido, carros existem após o ano de 1885");
            return;
        }
        this.ano = ano;
    }

    public void apresentar(){
        System.out.println("O carro do modelo " + modelo + " da marca " + marca + " pertence ao ano de " + ano);
    }

}
