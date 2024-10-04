import java.util.Scanner;

public class semana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do dia da semana (0-6): ");
        int dia_semana = scanner.nextInt();

        if (dia_semana == 0) {
            System.out.println("Domingo");    
        } else if (dia_semana == 5) {
                System.out.println("Sextou");      
            } else if (dia_semana == 6) {   
                    System.out.println("Sabadou");
                } else if (dia_semana >= 1 && dia_semana <=4) {
                    System.out.println("Trabalhar");
        } else {
                System.out.println("Digite apenas numero de 0 a 6!!! ");
            }

    }
}
