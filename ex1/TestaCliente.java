package ex1;

public class TestaCliente {

    public static void main(String[] args) {

        Cliente cliente01 = new Cliente (2235,1188457,"Pedro",0);
        cliente01.depositar(1500);
        cliente01.sacar(250);
        System.out.println(cliente01.dadosCliente());


        Cliente cliente02 = new Cliente (5478,77879,"Rita", 500);
        cliente02.depositar(1500);
        cliente02.sacar(2500);
        System.out.println(cliente02.dadosCliente());
    }
}
