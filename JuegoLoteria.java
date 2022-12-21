import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
public class JuegoLoteria {


    public static void main(String[] args) {


        int [] boleto = new int[6];
        Random azar = new Random();
        int c=0;
        String boletoStr;

        do{
             int valor=azar.nextInt(49)+1;
            boolean repetido= false;

            for(int i=0;i<c;i++){
                if(boleto[i]==valor) repetido=true;
            }

            if (repetido==false){
                boleto[c] = valor;

                c++;
            }


        }while(c<6);

        int reintegro = azar.nextInt(5)+1;


        boletoStr = Arrays.toString(boleto);

        JOptionPane.showMessageDialog(null, "Tu número de la primitiva es:\n"+"\n"+boletoStr+"\n"+"\nReintegro: "+reintegro);

    }


}

