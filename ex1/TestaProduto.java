package ex1;
public class TestaProduto {
    public static void main(String[] args) {

        Produto bavaria = new Produto (1245, "Maritaca",250,1.49F);
        bavaria.comprar(250);
        bavaria.vender(100);
        System.out.println(bavaria.mostra());
        bavaria.subir(0.10F);
        bavaria.descer(0.5F);
        System.out.println(bavaria.mostra());

        Produto mascara = new Produto(1452,"Mascara",100,3);
        mascara.comprar(10);
        mascara.subir(0.5F);

        System.out.println(mascara.mostra());

        Produto alcool = new Produto(1548,"Alcool Gel",200,2);
        alcool.vender(5);
        alcool.descer(5);

        System.out.println(alcool.mostra());







    }
}
