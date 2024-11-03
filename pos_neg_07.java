import java.util.Scanner;

public class pos_neg_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contagemPositivos = 0;
        int contagemNegativos = 0;
        double menorValor = 0;
        boolean primeiroValor = true; 

        
        System.out.println("Digite valores reais (digite 0 para encerrar):");
        while (true) {
            System.out.print("Valor: ");
            double valor = scanner.nextDouble();

            
            if (valor == 0) {
                break;
            }

            
            if (valor > 0) {
                contagemPositivos++;
            } else if (valor < 0) {
                contagemNegativos++;
            }

            
            if (primeiroValor) {
                menorValor = valor;
                primeiroValor = false;
            } else if (valor < menorValor) {
                menorValor = valor;
            }
        }

        System.out.println("\n Resultados:");
        System.out.println("Quantidade de valores positivos: " + contagemPositivos);
        System.out.println("Quantidade de valores negativos: " + contagemNegativos);

        scanner.close();
    }
}
