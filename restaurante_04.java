import java.util.Scanner;

public class restaurante_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa Restaurante:");
        System.out.println("-----------------");

        System.out.println("Menu de Lanches:");
        System.out.println("1 - Hambúrguer (R$ 10)");
        System.out.println("2 - Cachorro-quente (R$ 7)");
        System.out.println("3 - Batata Frita (R$ 5)");

        System.out.println("Escolha seu lanche: ");
        int escolha =scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Você escolheu: Hambúguer");
                System.out.println("Valor a pagar: R$ 10");
                break;
            case 2:
                System.out.println("Você escolheu: Cachorro-quente");
                System.out.println("Valor a pagar: R$ 7");
                break;
            case 3:
                System.out.println("Você escolheu: Batata Frita");
                System.out.println("Valor a pagar: R$ 5");
                break;

            default:
                System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 3.");
                break;
        }
        scanner.close();
    }
}
