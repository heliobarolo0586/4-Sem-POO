package ex1;

public class Aluno {
    String nome;
    int numeroAluno, idade;
    float p1, p2;

    public Aluno() {

    }

    public Aluno(String nome, int numeroAluno, int idade, float p1, float p2) {
        this.nome = nome;
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notaFinal() {
        float media = (this.p1 + this.p2) / 2;
        return media;
    }

    // Verifica se Passou de Ano
    public String passou() {
        if (this.notaFinal() >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    // return (this.notaFinal() >= 6) ? "Aprovado" : "Reprovado";

    public String dadosAluno() {
        return "Número Aluno " + this.numeroAluno + "\n Nome: " + this.nome + "\n Nota Final: " + this.notaFinal()
                + "\n" + this.passou() + "\n";
    }

}
