package aula07;

import java.util.Random;

public class Luta {
    public static int lutas;
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    //Métodos
    public void marcarLuta() {
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && !desafiado.getNome().equals(desafiante.getNome())) {
            this.aprovada = true;
          //  System.out.println("Luta Aprovada");
        } else {
            this.aprovada = false;
            //System.out.println("Luta desaprovada " + desafiante.getCategoria() + " " + desafiado.getCategoria());
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (isAprovada()) {
            //desafiado.apresentar();
            //desafiante.apresentar();
            Random vencedor = new Random(3);
            switch (Integer.parseInt(vencedor.toString())) {
                case 0:
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    //System.out.println("Luta Empatada");
                    break;
                case 1:
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    //System.out.println("Luta ganha pelo: " + desafiante.getNome());
                    break;
                case 2:
                    desafiante.perderLuta();
                    desafiado.ganharLuta();
                    //System.out.println("Luta ganha pelo: " + desafiado.getNome());
                    break;
            }
        } else {
            //System.out.println("Luta não pode acontecer");
        }
    }

    // Constructor
    public Luta(Lutador desafiado, Lutador desafiante, int rounds) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
        this.rounds = rounds;
    }

    public int getLutas() {
        return lutas;
    }

    public void setLutas(int lutas) {
        this.lutas = lutas;
    }
    
    //getters and setters
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
