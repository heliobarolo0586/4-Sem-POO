package ex2.produto;
public class TestaProduto {

    public static void main(String[] args) {

        Produto prod1 = new Produto (1245, "Maritaca",250,1.49F);
        

        Produto prod2 = new Produto(1452,"Mascara",100,3);
        prod2.comprar(10);
        prod2.subir(0.5F);

        System.out.println(prod1.mostra());
        System.out.println(prod2.mostra());
        System.out.println("Quantidade:" + prod2.getQtde());

        Produto prod3 = new Produto(1548,"Alcool Gel",200,2);
        prod3.setQtde(5);
        prod3.setPreco(5);

        Produto prod4 = new Produto(1548,"Alcool Gel",200,2);
        prod4.setQtde(-5);
        prod4.setPreco(-5);
        prod4.setId(-2);
        prod4.setDescricao("Chuveiro");

        Produto prod5 = new Produto(100,"Xicára",10,12);
        prod5.setQtde(12);
        prod5.descer(-10);
        System.out.println(prod5.mostra());

        Produto prod6 = new Produto (15,"Creme de Barbear", -14, -8.50F);
        System.out.println(prod6.mostra());

    }
}
