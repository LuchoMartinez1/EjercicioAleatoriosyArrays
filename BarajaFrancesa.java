public class BarajaFrancesa {

    public static void main(String[] args) {

        System.out.println("Tu Carta es "+randomCarta()+randomPalo());

    }
    public static String randomCarta() {
        int carta=1;
        String numCarta = String.valueOf(carta);
        carta = (int)(Math.random () * 13  + 1 );

        switch (carta) {
            case 1: numCarta="el As ";
                break;
            case 2: numCarta="el 2 ";
                break;
            case 3: numCarta="el 3 ";
                break;
            case 4: numCarta="el 4 " ;
                break;
            case 5: numCarta="el 5 ";
                break;
            case 6: numCarta="el 6 ";
                break;
            case 7:numCarta="el 7 ";
                break;
            case 8: numCarta="el 8 ";
                break;
            case 9: numCarta="el 9 ";
                break;
            case 10:numCarta="el 10 ";
                break;
            case 11: numCarta="la J ";
                break;
            case 12: numCarta="la Q ";
                break;
            case 13: numCarta="la K ";
                break;
        }
        return numCarta;

    }
    public static String randomPalo() {
        int palo=1;
        String numPalo = String.valueOf(palo);
        palo = (int)(Math.random () * 4 + 1 );

        switch (palo) {
            case 1: numPalo = "de Diamantes";
                break;
            case 2: numPalo = "de Corazones";
                break;
            case 3: numPalo = "de Picas";
                break;
            case 4: numPalo = "de Tréboles";
                break;
        }
        return numPalo;

    }
}
