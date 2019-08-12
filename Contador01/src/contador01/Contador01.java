package contador01;
public class Contador01 {
    public static void main(String[] args) {
        int contador = 0;
        while(contador < 10){
            contador++;
            if (contador > 1 && contador < 4){    
                continue;
            }
            if (contador == 0){
                System.out. format("Deu %s cambalhotas\n", contador);
            }
            else {
                System.out.format("Deu %s cambalhotas\n", contador);
            }
            if (contador == 7){
                break;
            }
            
        }
    }
    
}
