package aula10;
public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    //Métodos especiais
    public void fazerAniv(){
        setIdade(getIdade() + 1);
    }
    //Constructor

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    //Getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}
