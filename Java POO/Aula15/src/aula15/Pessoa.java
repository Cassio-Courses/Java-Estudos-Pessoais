package aula15;

public class Pessoa {

    protected String nome;
    protected char sexo;
    protected int idade;
    protected float experiencia;

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", experiencia=" + experiencia + '}';
    }

    public Pessoa(String nome, char sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;

    }

    public Pessoa() {
    }

    protected void GanharExp() {
        setExperiencia(getExperiencia() + 10);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

}
