package ex1;

public class TestaCarro {
    // Vamos criar os objetos
    // vamos criar o método main

    public static void main(String args[]){
        //Hello world!!!!!!!!
        System.out.println("Hello World - Good night!");
        //Vamos criar um carro
        Carro obj1 = new Carro();
        obj1.modelo = "Onix";
        obj1.ano = 2019;
        obj1.motor = true;
        obj1.velocidade = 110;

        Carro obj2 = new Carro("Celta", 2016, false, 0); // Chama o método construtor (inicailiza os valores)
        

        obj1.mostra();
        obj2.mostra();
        //System.out.println("Obj1: Modelo: " + obj1.modelo + " Ano: "+ obj1.ano + " Motor: " + obj1.motor + " Velocidade: " + obj1.velocidade + "");

    }
 
}
