package ex1;

public class Carro {

    // dois tipos de váriaveis
    // tipo primitivo - int, float, double, char, int
    // tipo de classe - String, Float, Double, Integer

    // Propriedades (Variaveis) da classe
    float velocidade; // número com ponto flutuannte
    boolean motor; // booleana - true (ligado) ou false (desligado)
    int ano; // número inteiro
    String modelo; // String é uma classe pronta - conjunto de caracteres

    //Método construtor vazio
    public Carro (){
        
    }

    //Método construtor
    public Carro(String modelo, int ano, boolean motor, float velocidade){
        // Variavel do objeto = variavel do usuário.
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
        this.velocidade = velocidade;
    }

    // um metodo ou operação de
    public void mostra() {
        System.out.println (
                "Modelo: " + this.modelo + 
                " Ano: " + this.ano + 
                " Motor: " + this.motor + 
                " Velocidade: " + this.velocidade
                );
    }
}