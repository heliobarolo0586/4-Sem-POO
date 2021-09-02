package ex1;
public class TestaRio {
    public static void main(String[] args) {
        Rio rio01 = new Rio ("Três Marias", 200,true);
        rio01.chover(250);
        System.out.println(rio01.mostra());
        rio01.ensolarar(180);
        rio01.limpar();
        System.out.println(rio01.mostra());
        rio01.sujar();
        System.out.println(rio01.mostra());

        Rio rio02 = new Rio ("Rio Negro", 500,false);
        System.out.println(rio02.mostra());
        rio02.sujar();
        rio02.ensolarar(500);
        System.out.println(rio02.mostra());
        rio02.limpar();
        rio02.chover(800);
        System.out.println(rio02.mostra());

    }
}
