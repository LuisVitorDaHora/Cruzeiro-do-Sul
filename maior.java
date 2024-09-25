public class maior {
    public static void main(String[] args) {
        
        int  a,b,c;

        a = 5;
        b = 7;
        c = 6;
        
        if (a > b) {
            if (a > c) {
                System.out.println(" O maior valor é: " + a);
            } else {
                System.out.println(" O maior valor é: " + c);
            }
        } else if (b > c) {
            System.out.println(" O maior valor é: " + b);
        } else {
            System.out.println("O maior valor é: " + c);
        }
    }
}