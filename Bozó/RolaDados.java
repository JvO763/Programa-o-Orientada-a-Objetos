import java.util.InputMismatchException;
import java.util.Scanner;

public class RolaDados {

    static int quantos;
    int a;
    static int[] vetor = new int[6];
    static String[] visual = new String[6];
    static int[] teste = new int[6];
    int Rolalos(int quantos) {

        Dado dado1 = new Dado();
        for(int i=0; i<quantos; i++){

            dado1.rolar();
            vetor[i]=dado1.getLado();
            visual[i]=dado1.toString();
            System.out.printf(visual[i]);
            System.out.printf("\n");
            for(int j=0;j<763763;j++){}
        };
    return 1;
    }
    int trocar(){
        EntradaTeclado leitura3 = new EntradaTeclado();
        Dado dado1 = new Dado();
        for(int i=0; i<5; i++){
            System.out.printf("\nDeseja trocar o %dº dado? Digite '1' para sim e '0' para não: ", i+1);
            teste[i]=leitura3.Ler();

            if(teste[i]==1){
                System.out.printf("\no dado %d foi trocado", i+1);
                dado1.rolar();
                vetor[i]=dado1.getLado();
                visual[i]=dado1.toString();
                //System.out.printf(visual[i]);
                System.out.printf("\n");
            }
        }
        for(int i=0; i<5; i++){
            //System.out.printf("%d",vetor[i]);
            System.out.printf(visual[i]);
            System.out.printf("\n");
        }
    return 0;
    }

    int valores(int numero){

            return vetor[numero];

    }


    public static void main(String[] args) {
        RolaDados obj = new RolaDados();

    }
}





