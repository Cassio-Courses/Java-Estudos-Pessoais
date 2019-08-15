package aula07;

import java.util.logging.Logger;

public class Lutador {

    /**
     * Nome, Nacionalidade, Idade, Altura, Peso, Categoria, Vitorias, Derrotas,
     * Empates métodos apresentar(), status(), ganharLuta(),perderLuta(),
     * empatarLuta()
     *
     */
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    //Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        if (peso > 80) {
            this.categoria = "Pesado";
        } else if (peso >= 70) {
            this.categoria = "Medio";
        } else {
            this.categoria = "Leve";
        }
    }

    //Métodos
    public void apresentar() {
        System.out.println("---------------APRESENTAÇÃO---------------");
        System.out.println("Este é o lutador " + this.nome + " e " + this.idade + " anos");
        System.out.println("De peso " + this.peso + " kgs e altura: " + this.altura);;
        System.out.println("Nacionalidade: " + this.nacionalidade + " e categoria: " + this.categoria);
        System.out.println("Vitórias: " + this.vitorias + " Derrotas: " + this.derrotas + " e Empates: " + this.empates);
        System.out.println("------------------------------------------");
    }

    public void status() {
        System.out.println("------------------STATUS------------------");
        System.out.println("Nome: " + this.nome + " Peso: " + this.peso + " Kilos e Altura: " + this.altura);
        System.out.println("Vitórias: " + this.vitorias + " Derrotas: " + this.derrotas + " e Empates: " + this.empates);
        System.out.println("------------------------------------------");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        if (peso < 52.2) {
            setCategoria("Inválido");
        } else if (peso <= 70.3) {
            setCategoria("Leve");
        } else if (peso <= 83.9) {
            setCategoria("Médio");
        } else if (peso <= 120.2) {
            setCategoria("Pesado");
        } else {
            setCategoria("Inválido");
        }
    }

    private void setCategoria(String categoria) {
        this.categoria = categoria;

    }
}
