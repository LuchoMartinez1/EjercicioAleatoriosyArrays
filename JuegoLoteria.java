import java.util.Random;
public class JuegoLoteria {


    public static void main(String[] args) {

        int [] boleto = new int[6];
        Random azar = new Random();
        int c=0;


        do{
            int valor=azar.nextInt(49)+1;
            boolean repetido= false;

            for(int i=0;i<c;i++){
                if(boleto[i]==valor) repetido=true;
            }

            if (!repetido){

            }
            c++;

        }while(c<6);

    }
}
