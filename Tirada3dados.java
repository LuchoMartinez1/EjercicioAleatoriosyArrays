
public class Tirada3dados {
    public static void main(String[] args){

       int tirada;
       int suma = 0;

       for(int i=0; i<3 ; i++){
           tirada = (int)(Math.random () * 6 + 1 );
           System.out.println(tirada);
           suma += tirada;
        }
        System.out.println(suma);

    }
}