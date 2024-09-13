import java.util.Scanner;

public class exercito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o seu sexo: ");
        char sexo = scanner.next().charAt(0);

        if ((sexo == 'M') || (sexo == 'm')) {
            System.out.println("Informe sua idade: ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                System.out.println("Você pode se alistar. ");
            } else {
                System.out.println("Você não pode se alistar. ");
            }
        }else if ((sexo == 'F') || (sexo == 'f')) {
            System.out.println("Você é do sexo Feminino, Não pode se alistar. ");
        } else {
            System.out.println("Informe apenas 'M' ou 'F' ");
        } 
 
        scanner.close();
    }
}
