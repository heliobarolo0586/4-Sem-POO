package ex2.aluno;

import javax.swing.JOptionPane;

public class TestaAluno {
    public static void main(String[] args){
        Aluno aluno1 = new Aluno();
        //JOptionPane.showInputDialog("Informe") retorna uma String
        //Integer.parseInt converte String em int 
        aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe idade do Aluno!")));
        aluno1.setNome(JOptionPane.showInputDialog("Informe Nome do Aluno"));
        aluno1.setNumeroAluno(Integer.parseInt(JOptionPane.showInputDialog("Informe número do Aluno")));
        aluno1.setP1(Float.parseFloat(JOptionPane.showInputDialog("Informe nota Prova 01")));
        aluno1.setP2(Float.parseFloat(JOptionPane.showInputDialog("Informe nota Prova 02")));
        System.out.println(aluno1.dadosAluno());
        JOptionPane.showMessageDialog(null, aluno1.dadosAluno());

        Aluno aluno2 = new Aluno(654321,22,"Hélio",9,8);
        JOptionPane.showMessageDialog(null, aluno2.dadosAluno());

    }
}
