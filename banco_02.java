import java.util.Scanner;

public class banco_02 {
    public static void main(String[] args) {
        
        double salario; 
        int pendencias;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa Banco:");
        System.out.println("-----------------");

        
        System.out.print("Digite o seu salário: ");
        salario = scanner.nextDouble();

        
        System.out.print("Digite o número de pendências: ");
        pendencias = scanner.nextInt();

        
        if (salario > 2500 && pendencias <= 2) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo negado.");
        }
        scanner.close();
    }
}
