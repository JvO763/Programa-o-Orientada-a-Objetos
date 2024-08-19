import java.util.InputMismatchException;
import java.util.Scanner;

public class Pass {
    static Scanner leitura = new Scanner(System.in);
    int max;

    public static int setMax () {
        int n, i;
        n=1;
        do {
            try {
                i=0;
                System.out.println("\nQual o valor máximo do intervalo da senha? ");
                Scanner leitor = new Scanner(System.in);
                n=leitor.nextInt();
            } catch (Exception e) {
                System.out.println("\nO valor que você digitou não é válido. Tente um número Inteiro!");
                i=1;
            }

        }while(i==1);

        return (n);
    }

    public Pass () {
        max = setMax();
        Random rd = new Random();
        int pass = rd.getIntRand(max);
        comecar(pass);
    }

    public static int palpite () {
        int palpite, i;
        i=0;
        palpite=0;

        do {
            try {
                i=0;
                System.out.printf(" Digite um número: ");
                Scanner leitor = new Scanner(System.in);
                palpite=leitor.nextInt();
            } catch (Exception e) {
                System.out.println("\nO valor que você digitou não é válido. Tente um número Inteiro!");
                i=1;
            }

        }while(i==1);
        return (palpite);
    }

    public static void comecar (int pass) {
        System.out.printf("Tente acertar a senha!");

        int tentativas = 0;
        int palpite;

        int i=0;

        while (i==0) {
            tentativas=tentativas+1;
            palpite = palpite();
            if (palpite == pass) {
                System.out.println("Parabéns! Você acertou a senha.");
                i=1;
            }
            teste(palpite, pass);
        }
        System.out.printf("\nVocê acertou após %d tentativas.", tentativas);
        System.out.println(" ");
    }



    public static void teste (int palpite, int pass) {
        if (palpite < pass)
            System.out.printf("Tente um valor maior!");
        else if (palpite > pass)
            System.out.printf("Tente um valor menor!");
    }

    public static void main(String[] args) {
        Pass obj = new Pass();
    }
}