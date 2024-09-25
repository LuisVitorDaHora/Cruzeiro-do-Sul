import java.util.Scanner;

public class par {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int num1 = scanner.nextInt();

        if (num1 % 2 == 0 ) {
            System.out.println("O número " + num1 + " é par.");
        } else {
            System.out.println("O número " + num1 + " é ímpar.");
        }
        

    }
}
