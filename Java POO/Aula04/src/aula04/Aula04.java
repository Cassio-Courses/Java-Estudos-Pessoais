package aula04;
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", 0.5f, "Bruezão");
        Caneta c2 = new Caneta("Compact", 0.7f, "Mais verde que a tua mãe");
        c2.setTampada(false);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        
        
    }
    
}
