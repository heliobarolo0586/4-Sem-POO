package ex1;

public class TestaAluno{

    public static void main(String args[] ){


        //Vamos criar uma instância de aluno
        Aluno obj1 = new Aluno("Flavio",52456,17,5,9);
        //Chama construtor Aluno(String, int, float, float)
        Aluno obj2 = new Aluno("José", 52056, 14, 6,7);

        System.out.println(obj1.dadosAluno());
        System.out.println(obj2.dadosAluno());

    }
}