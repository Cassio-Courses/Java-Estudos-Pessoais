package aula06;
public class Aula06 {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.abrirMenu();
        for (int vol = 50; vol < 80; vol+=1){
            c.maisVolume();
            
        }
        c.abrirMenu();
    }
    
}
