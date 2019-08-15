package programapernas;

import java.util.Scanner;

public class ProgramaPernas {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int pernas = tec.nextInt();
        String tipo;
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 8:
                tipo = "Aranha";
                break;
            default:
                if (pernas < 0){
                    tipo = "Inexistente, tipo menor que 0, tipo digitado: " + pernas;
                }else{
                tipo = "ET"; 
                }
        }
        System.out.println(tipo);
    }
    
}
