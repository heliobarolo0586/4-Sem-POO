package ex2.banco;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        obj1.setNumeroConta("123456-8");
        obj1.setNumeroAgencia("1234-5");
        obj1.setNome("Hélio");
        obj1.setSaldo(1000);
        obj1.realizarDeposito(500);
        obj1.realizarSaque(1000);
        System.out.println(obj1.mostra());

        Cliente obj2 = new Cliente("111111-1","2222-2","Felipe", 2000);
        obj2.realizarSaque(3000);
        System.out.println(obj2.mostra());
    
    }
}
