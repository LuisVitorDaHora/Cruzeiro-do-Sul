import java.util.Scanner;

public class AlturaMedia_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pessoas; 
        double somaAlturaHomens = 0, somaAlturaMulheres = 0;
        int contadorHomens = 0, contadorMulheres = 0;

        System.out.print("Digite o número de pessoas: ");
        pessoas = scanner.nextInt();

        for(int i = 0; i < pessoas; i++){
            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);

            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();

            if ( sexo == 'M' || sexo == 'm' ) {
                somaAlturaHomens += altura;
                contadorHomens++;
            } else if (sexo == 'F' || sexo == 'f') {
                somaAlturaMulheres += altura;
                contadorMulheres++;
            } else {
                System.out.println("Sexo inválido! Digite M ou F.");
            }
        }
        double alturaMediaHomens = (contadorHomens > 0) ? somaAlturaHomens / contadorHomens : 0;
        double alturaMediaMulheres = (contadorMulheres > 0) ? somaAlturaMulheres / contadorMulheres : 0;

        System.out.println("Altura média dos homens: " + alturaMediaHomens);
        System.out.println("Altura média das mulheres: " + alturaMediaMulheres);

        scanner.close();
    }
}
