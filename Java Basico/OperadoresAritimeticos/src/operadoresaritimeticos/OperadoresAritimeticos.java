package operadoresaritimeticos;

public class OperadoresAritimeticos {

    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 5;
        int valor = 4 + n1++;
        System.out.println(valor);
        Math.pow(n1, n2);
        float v = 8.3f;
        int ar = (int) Math.round(v);//ceil, floor
        System.out.println(ar);
        int random;
        random = 1;
        System.out.println(random);
        int aleatorio = (int) (5 + Math.random() * (10 - 5)); // Método para criar numeros aleatorios inteiros
        //exemplo:
        int min = 2;
        int max = 5;
        int aleat = (int) (min + Math.random() * (max - min));
        System.out.println(aleat);
        random = (int) (1 + Math.random() * (6-1));
        System.out.println(random);
        
        
    }

}
