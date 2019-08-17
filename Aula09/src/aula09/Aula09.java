package aula09;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Cassio", 21, 'M');
        Livro l1 = new Livro("A volta dos que não foram", "Juninho", 10, p1);
        p1.fazerAniver();
        l1.abrir();
        l1.abrir();
        l1.fechar();
        l1.fechar();
        for(int c = 0; c <= 12; c++){
            if(c == 1){
                l1.abrir();
            }
            l1.avancarPag();
        }
        l1.detalhes();
        
    }
    
}
