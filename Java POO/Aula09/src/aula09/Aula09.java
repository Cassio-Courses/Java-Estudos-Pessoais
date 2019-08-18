package aula09;

public class Aula09 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Cassio", 21, 'M');
        Livro l1 = new Livro("A volta dos que não foram", "Juninho", 10, p1);
        p1.fazerAniver();
        l1.abrir();
        l1.folhear(9);
        l1.detalhes();
        l1.folhear(12);
        l1.detalhes();
        l1.folhear(-5);
        l1.detalhes();

    }

}
