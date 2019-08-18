package aula09;

public class Pessoa {

    private String nome;
    private int Idade;
    private char Sexo;

    //Métodos especiais
    public void fazerAniver() {
        setIdade(getIdade() + 1);

    }
    //Constructors

    public Pessoa(String nome, int Idade, char Sexo) {
        this.nome = nome;
        this.Idade = Idade;
        this.Sexo = Sexo;
    }
    //Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

}
