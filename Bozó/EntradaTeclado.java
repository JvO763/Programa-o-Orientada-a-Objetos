import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaTeclado {
    static Scanner leitura = new Scanner(System.in);
    static int i, n;

    public static int Ler(){

        do {
            try {
                i = 0;
                Scanner leitura = new Scanner(System.in);
                n = leitura.nextInt();
            } catch (Exception e) {
                System.out.println("\nO valor que você digitou não é válido. Tente um número Inteiro!");
                i = 1;
            }

        } while (i == 1);
        return (n);
    };

    public static void main(String[] args) {
            EntradaTeclado obj = new EntradaTeclado();


    }
}






