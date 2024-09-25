import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a primeira nota: ");
    float n1 = scanner.nextFloat();
    
    System.out.println("Digite a segunda nota: ");
    float n2 = scanner.nextFloat();

    System.out.println("Digite a terceira nota: ");
    float n3 = scanner.nextFloat();

    float media = (n1+n2+n3)/ 3;

    System.out.println(media);

    if (media >= 6) {
        System.out.println("Aprovado");
    } else { 
        System.out.println("Reprovado" );
    }
    scanner.close();
    }

}

