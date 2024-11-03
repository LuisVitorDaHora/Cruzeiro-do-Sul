import java.util.Scanner;

public class emprestimo_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do cliente: ");
        double salario = scanner.nextDouble();
        System.out.print("Digite a quantidade de pendências: ");
        int pendencias = scanner.nextInt();

        if (pendencias <= 1 && salario >= 1000) {
            System.out.println("Empréstimo aprovado!");

            System.out.print("Digite o valor do empréstimo: R$ ");
            double valorEmprestimo = scanner.nextDouble();
            System.out.print("Digite o número de parcelas: ");
            int nParcelas = scanner.nextInt();

            double juros = valorEmprestimo * 0.9 * nParcelas / 100;
            double valorTotal = valorEmprestimo + juros;
            double valorParcela = valorTotal / nParcelas;

            System.out.printf("Valor de cada parcela: R$ %.2f%n", valorParcela);
            System.out.printf("Valor total do financiamento: R$ %.2f%n", valorTotal);
        } else {
            System.out.println("Empréstimo não aprovado. Verifique suas pendências ou salário.");
        }

        scanner.close();
    }
}