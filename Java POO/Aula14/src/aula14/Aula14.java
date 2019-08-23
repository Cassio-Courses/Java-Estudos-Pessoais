package aula14;

public class Aula14 {

    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML");
        System.out.println(v[0].toString());
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Caio_Gay", "Caio Daocu da Silva", 'F', 24);
        g[1] = new Gafanhoto("Cassindopop", "Cassio Lopes", 'M', 21);

        System.out.println(g[0].toString());
    }

}
