package ex2.produto;
public class Produto {
    private int id;
    private String descricao;
    private int qtde;
    private float preco;

    public Produto() {
    }

    public Produto(int id, String descricao, int qtde, float preco) {
        // construtor está considerando o encapsulamento
       this.setId(id);
       this.setDescricao(descricao);
       this.setQtde(qtde);
       this.setPreco(preco);
    }

    //Vamos criar os métodos setters
    public final void  setQtde(int qtde){
        if (qtde >= 0){
            this.qtde = qtde;
        } else{
            System.out.println("Quantidade do produto não pode negativo");
        }
    }

    public final void setPreco(float preco){
        if (preco >= 0){
            this.preco = preco;
        }
        else {
            System.out.println("Preço de produto não pode negativo");
        }
    }

    public final void setId(int id){
        if (id >= 0){
            this.id = id;
        }
        else {
            System.out.println("ID não pode ser zero");
        }
    }

    public final void setDescricao(String descricao){
        if (descricao.isEmpty()){
            System.out.println("Descrição de produto não pode ser vazia");
        } else {
            this.descricao = descricao;
        }
    }

    //Getters(Retorna os dados com Private)
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQtde() {
        return qtde;
    }

    public float getPreco() {
        return preco;
    }

    //
    public void comprar(int x){
        this.qtde +=x;
    }

    public void vender(int x){
            this.setQtde(this.qtde-x);
    }

    public void subir(float x){
        this.preco +=x;

    }

    public void descer(float x){
        this.setPreco (this.preco-x);
    }

    public String mostra() {
        return "Produto \n descricao: " + this.descricao + 
        "\n id: " + this.id + "\n Preco: " + this.preco + 
        "\n Quantidade: " + this.qtde + "\n";
    }

    
}
