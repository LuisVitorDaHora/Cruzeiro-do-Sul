public class matriz {
    public static void main(String[] args) {

        int [] [] bingo = new int[5][5];
        int numeros = 0;

        for (int x = 0; x < 5; x++) {

            bingo[x] [0] = numeros + 2;
            numeros++;
        }

        bingo[4][2]= 8;
        bingo [3][3] = 500;

        for (int x = 0; x < 5; x++){
            for (int y = 0; y < 5; y++ ){
                System.out.println("Posição: " + x + "," + y + " = " + bingo[x][y]);

            }
            //System.out.println("Posição: "+ x + " = " +bingo[x][0]);
        }
    }
}
