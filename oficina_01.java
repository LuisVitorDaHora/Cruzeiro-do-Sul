import java.util.Scanner;

public class oficina_01 {
    public static void main(String[] args) {
        
        int dist_perc,qtde_combus;
        double media;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa Oficina:");
        System.out.println("-----------------");
        

        System.out.println("Digite a distancia percorrida (em km): ");
        dist_perc = scanner.nextInt();

        System.out.println("Digite a quantidade de combustível consumido (em litros): ");
        qtde_combus = scanner.nextInt();

        media = dist_perc/qtde_combus;

        System.out.println("Consumo médio do veiculo: " + media + " km/L" );

        scanner.close();
    }
}
