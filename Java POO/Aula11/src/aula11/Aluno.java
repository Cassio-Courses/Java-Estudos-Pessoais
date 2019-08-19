package aula11;

public class Aluno extends Pessoa {

    private int matr;
    private String curso;

    //Métodos especiais

    /**
     * Seta matricula 0
     */
    public void cancelarMatr() {
        setMatr(0);
    }
    public void pagarMensalidade(){
        System.out.println("Pagou mensalidade");
    }

    @Override
    public String toString() {
        return "Aluno{" + "matr=" + matr + ", curso=" + curso + '}';
    }

    //Método construtor
    public Aluno(String nome, int idade, char sexo, int matr, String curso) {
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;

    }
    //Getters and Setters

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
