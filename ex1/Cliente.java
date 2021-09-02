package ex1;

public class Cliente {
    int numeroConta;
    int numeroAgencia;
    String nome;
    float saldo;

    public Cliente() {
    }

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(float x) {
        this.saldo = this.saldo + x;
    } 

    public void sacar(float x) {
        if(this.saldo - x >= 0){
            this.saldo = this.saldo - x;
        } else{
            System.out.println("Saldo Insuficiente");
        }
    }

    public String dadosCliente() {
        return "Cliente: \n Nome: " + nome + "\n NumeroAgencia: " + numeroAgencia + "\n NumeroConta:" + numeroConta
                + "\n Saldo =" + saldo + "\n";
    }

    //Retorna dados do cliete
    

    

    
}
