public class GeneradorMelodía {
    public static void main(String[] args) {
        int compases = 4*(int) (Math.random() * 7+1);
        String nota = "";
        String primeraNota = "";

        for (int contadorNota = 1; contadorNota<=compases; contadorNota++) {
            switch ((int)(Math.random()*7)) {
                case 0:
                    nota="do";
                    break;
                case 1:
                    nota="re";
                    break;
                case 2:
                    nota="mi";
                    break;
                case 3:
                    nota="fa";
                    break;
                case 4:
                    nota="sol";
                    break;
                case 5:
                    nota="la";
                    break;
                case 6:
                    nota="si";
                    break;

            }

            if(contadorNota==1){
                primeraNota=nota;
            }
           if(contadorNota==compases){
               nota=primeraNota;
           }

            System.out.print(nota+" ");


            if (contadorNota==compases) {
                System.out.print("||");
            } else if (contadorNota%4==0) {
                System.out.print("|");
            }

        }

    }

}
