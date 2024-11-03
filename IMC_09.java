import java.util.Scanner;

public class IMC_09 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura: ");
        double alutra = scanner.nextDouble();

        System.out.println("Digite seu Sexo: ");
        char sexo = scanner.next().charAt(0);

        double imc = peso / (alutra * alutra);

        if (sexo == 'F' || sexo == 'f') {
            if (imc < 19.1) {
                System.out.println("Abaixo do peso");
            } else if (imc >= 19.1 && imc <= 25.8){
                System.out.println("No peso normal");
            } else if (imc >= 25.8 && imc <= 27.3) {
                System.out.println("marginalmente acima do peso");
            }else if (imc >= 27.3 && imc <= 32.3) {
                System.out.println("Acima do peso ideal");
            } else {
                System.out.println("Obeso");
            }
        } else if ( sexo == 'M' || sexo == 'm') {
            if (imc < 20.7) {
                System.out.println("Abaixo do peso");
            } else if (imc >= 20.7 && imc <= 26.4) {
                System.out.println("No peso normal");
            } else if (imc >= 26.4 && imc <= 27.8) {
                System.out.println("marginalmente acima do peso");
            } else if (imc >= 27.8 && imc <= 31.1) {
                System.out.println("acima do peso ideal");
            } else {
                System.out.println("Obeso");
            }
        }else {
            System.out.println("Sexo inválido. Digite 'M' para masculino ou 'F' para feminino.");
            return;
        }
        System.out.printf("Seu IMC é: %.2f\n", imc);

        scanner.close();
    }
}