import java.util.InputMismatchException;
import java.util.Scanner;

public class Bozo {
     static int leitura, pontosglobais, posicao;
     static int[] vector = new int[6];


    public static void QuerJogar() {

        EntradaTeclado ler = new EntradaTeclado();
        System.out.println("\nQuer jogar bozó? Pressione Enter");
        Scanner s = new Scanner(System.in);
        s.nextLine();
        System.out.println("\nVamos nessa!");

    }
    public Bozo() {

    }
    public static void main(String[] args) {
        Bozo obj = new Bozo();
        Bozo jogo = new Bozo();
        jogo.QuerJogar();
        int[] chave = new int[10];
        chave[1]=1;
        chave[2]=1;
        chave[3]=1;
        chave[4]=1;
        chave[5]=1;
        chave[6]=1;
        chave[7]=1;
        chave[8]=1;
        chave[9]=1;
        chave[0]=1;
        for(int partida=0;partida<3;partida++){
            RolaDados rolar1;
            rolar1 = new RolaDados();
            rolar1.Rolalos(5);
            rolar1.trocar();
            rolar1.trocar();
            for(int i=0;i<5;i++) {
                vector[i] = rolar1.valores(i);
            //    System.out.printf("\n%d", vector[i]);
            }
            Placar placar = new Placar();
            System.out.printf("\nPosições:\n  1   |   Full    |   4   \n  2   |   Seq.    |   5   \n  3   |   Quadra  |   6   \n      |   Quina   |");
            System.out.printf("\nEscolha: \n  1   |   7    |   4   \n  2   |   8    |   5   \n  3   |   9    |   6   \n      |   10   |\n");
            EntradaTeclado leiturapos = new EntradaTeclado();
            int sair=1;
            do {
                posicao = leiturapos.Ler();

                if(posicao==1){
                    if(chave[0]==1) {
                        pontosglobais=pontosglobais+placar.Um(vector);
                        chave[0]=0;
                        sair=0;
                    }
                    else{
                        System.out.printf("\nEscolha outra posição: ");
                    };

                }
                if(posicao==2){
                    if(chave[1]==1) {
                        pontosglobais=pontosglobais+placar.Dois(vector);
                        chave[1]=0;
                        sair=0;
                    }
                    else{
                        System.out.printf("\nEscolha outra posição: ");
                    };

                }
                if(posicao==3){
                    if(chave[2]==1) {
                        pontosglobais=pontosglobais+placar.Tres(vector);
                        chave[2]=0;
                        sair=0;
                    }
                    else{
                        System.out.printf("\nEscolha outra posição: ");
                    };

                }
                if(posicao==4){
                    if(chave[3]==1) {
                        pontosglobais=pontosglobais+placar.Quatro(vector);
                        chave[3]=0;
                        sair=0;
                    }
                    else{
                        System.out.printf("\nEscolha outra posição: ");
                    };

                }
                if(posicao==5){
                    if(chave[4]==1) {
                        pontosglobais=pontosglobais+placar.Cinco(vector);
                        chave[4]=0;
                        sair=0;
                    }
                    else{
                        System.out.printf("\nEscolha outra posição: ");
                    };

                }
                if(posicao==6){
                    if(chave[5]==1) {
                        pontosglobais=pontosglobais+placar.Seis(vector);
                        chave[5]=0;
                        sair=0;
                    }
                    else{
                        System.out.printf("\nEscolha outra posição: ");
                    };
                }
                if(posicao==7){
                    if(chave[6]==1) {
                        pontosglobais=pontosglobais+placar.Sete(vector);
                        chave[6]=0;
                        sair=0;
                    }
                    else{
                        System.out.printf("\nEscolha outra posição: ");
                    };
                }
                if(posicao==8){
                    if(chave[7]==1) {
                        pontosglobais=pontosglobais+placar.Oito(vector);
                        chave[7]=0;
                        sair=0;
                    }
                    else{
                        System.out.printf("\nEscolha outra posição: ");
                    };
                }
                if(posicao==9){
                    if(chave[8]==1) {
                        pontosglobais=pontosglobais+placar.Nove(vector);
                        chave[8]=0;
                        sair=0;
                    }
                    else{
                        System.out.printf("\nEscolha outra posição: ");
                    };
                }
                if(posicao==10){
                    if(chave[9]==1) {
                        pontosglobais=pontosglobais+placar.Dez(vector);
                        chave[9]=0;
                        sair=0;
                    }
                    else{
                        System.out.printf("\nEscolha outra posição: ");
                    };
                }

            } while(sair==1);
            System.out.printf("Você tem: %d pontos! Parabéns.", pontosglobais);
            System.out.println("\nPressione Enter");
            Scanner s = new Scanner(System.in);
            s.nextLine();
        }
        System.out.printf("Você acabou o jogo com %d pontos! Parabéns.", pontosglobais);
    }
}




