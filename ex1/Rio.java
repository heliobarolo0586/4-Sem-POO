package ex1;

public class Rio {
    String nome;
    float nivel;
    boolean poluido;

    public Rio() {
    }

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float x){
        this.nivel += x;
    }

    public void ensolarar(float x){
        this.nivel -= x;
    }

    public void limpar (){
        this.poluido = false;
    }

    public void sujar (){
        this.poluido = true;
    }

    public String mostra() {
        String auxiliar = this.poluido ? "Está poluído" : "Está limpo";
        return "Rio \n nome:" + nome + 
        "\n nivel: " + nivel + 
        "\n poluido: " + auxiliar + "\n";
    }

    



    
}
