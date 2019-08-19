package aula11;

public class Aula11 {

    public static void main(String[] args) {

        //não puedo, és abstracto
        //Pessoa p1 = new Pessoa("Cassio", 21, 'M');
        //p1.fazerAniv();
        //System.out.println(p1.toString());
        Aluno p2 = new Aluno("CassioAluno", 25, 'M', 32441, "Matematica");
        Professor p3 = new Professor("Prof", 50, 'M', "Especial", 1250);
        Funcionario p4 = new Funcionario("Prof", 50, 'M', "Secretaria", true);
        p2.cancelarMatr();
        p3.getEspecialidade();
        p4.fazerAniv();
        p4.mudarTrabalho();
        p4.mudarTrabalho();
        System.out.println(p4.toString());
    }

}
