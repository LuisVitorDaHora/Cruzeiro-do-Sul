import java.util.Scanner;

public class soma_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro e positivo para n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Por favor, insira um valor inteiro positivo.");
        }else {
            double soma = 0.0;

            for(int i =1; i <= n; i++){
                soma += 1.0/ i;
            }
            
            System.out.println("A soma S é: " + soma);
        }
    scanner.close();
    }
}
