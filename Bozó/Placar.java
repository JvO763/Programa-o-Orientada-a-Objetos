public class Placar {

    int Um(int[] vet){
        int pontos1=0;
            for(int i=0;i<vet.length-1;i++){
                  if(vet[i]==1){
                      pontos1=pontos1+1;
                  }
            }
        //System.out.printf("%d", pontos1);
        return pontos1;
    };

    int Dois(int[] vet){
        int pontos2=0;

            for(int i=0;i<vet.length-1;i++){
                if(vet[i]==2){
                    pontos2=pontos2+2;
                }
            }
        return pontos2;
    }
    int Tres(int[] vet){
        int pontos3=0;
            for(int i=0;i<vet.length-1;i++){
                if(vet[i]==3){
                    pontos3=pontos3+3;
                }
            }
        return pontos3;
    }
    int Quatro(int[] vet){
        int pontos4=0;
            for(int i=0;i<vet.length-1;i++){
                if(vet[i]==4){
                    pontos4=pontos4+4;
                }
            }
        return pontos4;
    }
    int Cinco(int[] vet){
        int pontos5=0;
            for(int i=0;i<vet.length-1;i++){
                if(vet[i]==5){
                    pontos5=pontos5+5;
                }
            }
        return pontos5;
    }
    int Seis(int[] vet){

        int pontos6=0;
            for(int i=0;i<vet.length-1;i++){
                if(vet[i]==6){
                    pontos6=pontos6+6;
                }
            }
        return pontos6;
    }

    int Sete(int[] vet){

        int pontos7=0;
        int[] ordenada = new int[5];
        int pivo;
        for(int i=0;i<vet.length-1;i++){
            ordenada[i]=vet[i];
        }
        for(int j=0;j<ordenada.length-1;j++) {
            for (int i = 0; i < ordenada.length - 1; i++) {
                if (ordenada[i] > ordenada[i + 1]) {
                    pivo = ordenada[i];
                    ordenada[i] = ordenada[i + 1];
                    ordenada[i + 1] = pivo;
                }
            }
        }
        if(ordenada[0]==ordenada[1]&&ordenada[2]==ordenada[3]&&ordenada[3]==ordenada[4]||ordenada[0]==ordenada[1]&&ordenada[1]==ordenada[2]&&ordenada[3]==ordenada[4]) {
            pontos7 = pontos7 + 15;
        }
        return pontos7;
    }

    int Oito(int[] vet){

        int pontos8=0;
        int[] ordenada = new int[5];
        int pivo;
        for(int i=0;i<vet.length-1;i++){
            ordenada[i]=vet[i];
        }
        for(int j=0;j<ordenada.length-1;j++) {
            for (int i = 0; i < ordenada.length - 1; i++) {
                if (ordenada[i] > ordenada[i + 1]) {
                    pivo = ordenada[i];
                    ordenada[i] = ordenada[i + 1];
                    ordenada[i + 1] = pivo;
                }
            }
        }
        int soma=0;
        for(int i=0;i<5-1;i++){
            if(ordenada[i]==ordenada[i+1]){
                soma=soma+1;
            }
        }
        if(soma<=1) {
            pontos8 = pontos8 + 20;
        }

        return pontos8;
    }

    int Nove(int[] vet){

        int pontos9=0;
        int[] ordenada = new int[5];
        int pivo;
        for(int i=0;i<vet.length-1;i++){
            ordenada[i]=vet[i];
        }
        for(int j=0;j<ordenada.length-1;j++) {
            for (int i = 0; i < ordenada.length - 1; i++) {
                if (ordenada[i] > ordenada[i + 1]) {
                    pivo = ordenada[i];
                    ordenada[i] = ordenada[i + 1];
                    ordenada[i + 1] = pivo;
                }
            }
        }
       if(ordenada[0]==ordenada[1]&&ordenada[1]==ordenada[2]&&ordenada[2]==ordenada[3]||ordenada[1]==ordenada[2]&&ordenada[2]==ordenada[3]&&ordenada[3]==ordenada[4]) {
           pontos9 = pontos9 + 30;
       }
        return pontos9;
    }

    int Dez(int[] vet){

        int pontos10=0;
        if(vet[0]==vet[1]&&vet[1]==vet[2]&&vet[2]==vet[3]&&vet[3]==vet[4]) {
            pontos10 = pontos10 + 40;
        }
        return pontos10;
    }
    public static void main(String[] args) {
        Placar obj = new Placar();


    }
}
