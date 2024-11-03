import java.util.Scanner;

public class desconto_03 {
    public static void main(String[] args) {
        
        double produto,desconto,valor_final;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa Loja:");
        System.out.println("-----------------");

        System.out.println("Digite o valor do produto: ");
        produto = scanner.nextDouble();

        desconto = produto * 0.10;

        valor_final = produto - desconto;

        System.out.printf("O valor final do produto após o desconto é: " + valor_final);

        scanner.close();
    }
}
