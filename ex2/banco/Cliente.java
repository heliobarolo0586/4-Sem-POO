package ex2.banco;
public class Cliente {
    private String numeroConta, numeroAgencia,nome;
    private float saldo;

    public Cliente() {
    }

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
       
    }

    public final void setNumeroConta (String numConta){
        if ((numConta.length() == 8) && (numConta.charAt(6) == '-')){
            this.numeroConta = numConta;
        }else{
            System.out.println("Numero de conta inválido, menor que 8 digitos!");
        }
    }

    public final void setNumeroAgencia (String numAgencia){
        if ((numAgencia.length() == 6) && (numAgencia.charAt(4) == '-')){
            this.numeroAgencia = numAgencia;
        } else{
            System.out.println("Numero de Agência inválido, menor que 6 digitos!");
        }
    }

    public final void setNome (String nome){
        if (nome.length() > 30){
            System.out.println("Nome inválido, maior que 30 caracteres!");
        } else{
            this.nome = nome;
        }
    }

    public final void setSaldo (float saldo){
        if (saldo >=0){
            this.saldo = saldo;
        }
    }

    public void realizarDeposito(float x){
        this.setSaldo(this.saldo + x);
    }

    public void realizarSaque(float x){
        if(x>0){
            this.setSaldo(this.saldo - x);
        }
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public String getNumeroAgencia() {
        return this.numeroAgencia;
    }

    public String getNome() {
        return this.nome;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public String mostra() {
        return "Cliente: \n nome:" + nome + 
        "\n numeroAgencia: " + numeroAgencia + 
        "\n numeroConta:" + numeroConta + "\n saldo:" + saldo;
    }

}
