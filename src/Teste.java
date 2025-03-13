import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        int[] teste = new int[10];
        carregaVetor(teste);
        mostraVetor(teste);
    }//main

    public static void carregaVetor(int[] teste){
        Random random = new Random();
        for(int i = 0; i < teste.length;i++){
            teste[i] = random.nextInt(15) ;
        }
    }

    public static void mostraVetor(int[] teste){
        for (int i : teste) {
            System.out.println(i);
        }
    }

}

