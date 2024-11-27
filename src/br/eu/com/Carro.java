package br.eu.com;

public class Carro {

    private String modelo;
    private double preco1;
    private double preco2;
    private double preco3;

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void preco(double preco1, double preco2, double preco3){
        this.preco1 = preco1;
        this.preco2 = preco2;
        this.preco3 = preco3;
    }

    public double calcularMaiorPreco(){
        double maiorPreco = preco1;
        if (preco2 > maiorPreco){
            maiorPreco = preco2;
        } else if (preco3 > maiorPreco){
            maiorPreco = preco3;
        }
        return maiorPreco;
    }

    public double calcularMenorPreco() {
        double menorPreco = preco1;
        if (preco2 < menorPreco) {
            menorPreco = preco2;
        } else if (preco3 < menorPreco) {
            menorPreco = preco3;
        }
        return menorPreco;
    }

    public void exibir(){
        System.out.println(modelo);
        System.out.println(preco1);
        System.out.println(preco2);
        System.out.println(preco3);
        System.out.println(calcularMaiorPreco());
        System.out.println(calcularMenorPreco());
    }

}
