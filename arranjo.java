public class arranjo {
    
    public static void main(String[] args) {
        
        String frutas[] = {"Morango", "Goiaba" , "Manga", "Uva", "Banana"};

        //System.out.println("1º Fruta: " + frutas[0]);

        for(int x = 0; x < 5; x++) {
            int numero_fruta = x + 1;
            System.out.println(numero_fruta + "º fruta " + frutas[x]);
        }
    }
}
