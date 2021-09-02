package ex2.aluno;

public class Aluno {
    private int numeroAluno, idade;
    private String nome;
    private float p1,p2;

    public Aluno() {
    }

    public Aluno(int numeroAluno, int idade, String nome, float p1, float p2) {
        this.setNumeroAluno(numeroAluno);
        this.setIdade(idade);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
    }

    public final void setNumeroAluno(int numeroAluno) {
        //Converte numeroAluno para String
        String numeroAlunoString =  String.valueOf(numeroAluno);
        if (numeroAlunoString.length() == 6){
            this.numeroAluno = numeroAluno;
        } else{
            System.out.println("Número do Aluno inválido,\n" + "Número do aluno deve conter 6 digítos");
        }
    }

    public final void setNome(String nomeAluno) {
        if (nomeAluno.length() <= 30 ){
            this.nome = nomeAluno;
        } else {
            System.out.println("Nome do Aluno inválido");
        }
    }

    public final void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        } else {
            System.out.println("Idade não pode ser negativa");
        }
    }

    public final void setP1(float p1){
        if (p1 >= 0){
            this.p1 = p1;
        } else {
            System.out.println("P1 não pode ser negativa");
        }
    }

    public final void setP2(float p2){
        if (p2 >= 0){
            this.p2 = p2;
        } else {
            System.out.println("P2 não pode ser negativa");
        }
    }

    public float notaFinal(){
      return (this.p1 + this.p2) / 2;
    }

    //Getters
    public int getNumeroAluno() {
        return numeroAluno;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public float getP1() {
        return p1;
    }

    public float getP2() {
        return p2;
    }

    public String dadosAluno() {
        return "Aluno: \n Idade: " + idade +
         "\n Nome do Aluno: " + nome + 
         "\n Número Aluno: " + numeroAluno + 
         "\n Prova 1° Bimestre: " + p1 + 
         "\n Prova 2° Bimestre: " + p2 + 
         "\n Média: " + this.notaFinal();
    }
 
}
