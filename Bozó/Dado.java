public class Dado {
    int pass1, pass2, pass;
    String s;
    int rolar(){
        Random rd = new Random();
        pass1 = rd.getIntRand(6) + 1;
        //pass2 = rd.getIntRand(6) + 1;
        pass=(pass1);
        return 0;

    }

    int getLado(){
        return pass;
    }

    @Override
    public String toString(){
      //return pass + "";

        if(pass==1){
            s = "_______\n|     |\n|  *  |\n|     |\n_______";
        };
        if(pass==2){
            s = "_______\n| *   |\n|     |\n|   * |\n_______";
        };
        if(pass==3){
            s = "_______\n| *   |\n|  *  |\n|   * |\n_______";
        };
        if(pass==4){
            s = "_______\n| * * |\n|     |\n| * * |\n_______";
        };
        if(pass==5){
            s = "_______\n| * * |\n|  *  |\n| * * |\n_______";
        };
        if(pass==6){
            s = "_______\n| * * |\n| * * |\n| * * |\n_______";
        };
        return s;
    }

    static public void main(String args[]) {
        Dado obj = new Dado();
        String s = obj.toString();

    }


}
