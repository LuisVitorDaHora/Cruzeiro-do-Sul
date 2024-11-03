import java.util.Scanner;

public class Pesquisa_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaIdades = 0;
        double somaSalariosHomens = 0;
        int contadorHomens = 0;
        int contadorMulheresSalarioBaixo = 0;
        int contadorPessoas = 0;

        while (true) {
            System.out.print("Digite a idade (ou um número negativo para encerrar): ");
            int idade = scanner.nextInt();

            if (idade < 0) {
                break; 
            }

            System.out.print("Digite o sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Digite o salário: ");
            double salario = scanner.nextDouble();

            
            somaIdades += idade;
            contadorPessoas++;

            if (sexo == 'M') {
                somaSalariosHomens += salario;
                contadorHomens++;
            } else if (sexo == 'F' && salario < 600) {
                contadorMulheresSalarioBaixo++;
            }
        }

        
        double mediaIdade = (contadorPessoas > 0) ? somaIdades / contadorPessoas : 0;
        double mediaSalarioHomens = (contadorHomens > 0) ? somaSalariosHomens / contadorHomens : 0;

        
        System.out.printf("Média de idade do grupo: %.2f\n", mediaIdade);
        System.out.printf("Média de salários dos homens: %.2f\n", mediaSalarioHomens);
        System.out.println("Quantidade de mulheres com salário abaixo de R$600,00: " + contadorMulheresSalarioBaixo);

        scanner.close();
    }
}